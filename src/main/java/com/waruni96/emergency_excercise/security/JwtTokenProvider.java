package com.waruni96.emergency_excercise.security;

import java.util.Date;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import com.waruni96.emergency_excercise.model.Employee;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
@Component
public class JwtTokenProvider {

	private static final Logger logger = LoggerFactory.getLogger(JwtTokenProvider.class);

	 @Value("${app.jwtSecret}")
   private String jwtSecret;

   @Value("${app.jwtExpirationInMs}")
   private int jwtExpirationInMs;
   
   @Resource(name="redisTemplate")          // 'redisTemplate' is defined as a Bean in AppConfig.java
   private HashOperations<String, Integer, String> hashOperations;
   
   public String generateToken(Authentication authentication, int userId) {

       UserPrincipal userPrincipal = (UserPrincipal) authentication.getPrincipal();

       Date now = new Date();
       Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

       String jwt	= Jwts.builder()
               .setSubject(userPrincipal.getUsername())
               .setIssuedAt(new Date())
               .setExpiration(expiryDate)
               .signWith(SignatureAlgorithm.HS512, jwtSecret)
               .compact();
       
       hashOperations.putIfAbsent(userId+"" , userId, jwt);
       return jwt;
       
   }

   public String getUserIdFromJWT(String token) {
       Claims claims = Jwts.parser()
               .setSigningKey(jwtSecret)
               .parseClaimsJws(token)
               .getBody();

       return claims.getSubject();
   }

   public boolean validateToken(String authToken) {
       try {
           Jwts.parser().setSigningKey(jwtSecret).parseClaimsJws(authToken);
           return true;
       } catch (SignatureException ex) {
           logger.error("Invalid JWT signature");
       } catch (MalformedJwtException ex) {
           logger.error("Invalid JWT token");
       } catch (ExpiredJwtException ex) {
           logger.error("Expired JWT token");
       } catch (UnsupportedJwtException ex) {
           logger.error("Unsupported JWT token");
       } catch (IllegalArgumentException ex) {
           logger.error("JWT claims string is empty.");
       }
       return false;
   }

}
