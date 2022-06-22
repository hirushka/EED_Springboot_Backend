package com.waruni96.emergency_excercise.serviceImpl;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.waruni96.emergency_excercise.dto.ApiResponse;
import com.waruni96.emergency_excercise.dto.JwtAuthenticationResponse;
import com.waruni96.emergency_excercise.dto.LoginRequest;
import com.waruni96.emergency_excercise.dto.SignUpRequest;
import com.waruni96.emergency_excercise.model.User;
import com.waruni96.emergency_excercise.model.UserDetails;
import com.waruni96.emergency_excercise.repo.UserDetailsRepo;
import com.waruni96.emergency_excercise.repo.UserRepo;
import com.waruni96.emergency_excercise.security.JwtTokenProvider;
import com.waruni96.emergency_excercise.service.AuthService;
@Service
public class AuthServiceImpl implements AuthService {

	@Autowired
	UserRepo usrRepo;
	
	@Autowired
	UserDetailsRepo usrDRepo;
	
	@Autowired
    PasswordEncoder passwordEncoder;
	
	@Autowired
	JwtTokenProvider tokenProvider;
	
	@Autowired
    AuthenticationManager authenticationManager;
	
	@Override
	public ResponseEntity<?> registerUser(@Valid SignUpRequest signUpRequest) {
		UserDetails ud = new UserDetails(signUpRequest.getFirstName(), 
				signUpRequest.getLastName(),
				signUpRequest.getEmpId(),
				signUpRequest.getDesignation(),
				signUpRequest.getEmpLocation(),
				signUpRequest.getRoleId()
				);

		UserDetails savedUseerD = usrDRepo.save(ud);
		// Creating user's account
		User user = new User(signUpRequest.getUsername(),  signUpRequest.getRoleId(),
		signUpRequest.getPassword(), savedUseerD.getId());
		
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		
		
		
		User result;
		
		//result = userFirebaseService.saveUserWithCollectionId(user.getUserName(),user);
		result = usrRepo.save(user);
		
		URI location = ServletUriComponentsBuilder.fromCurrentContextPath().path("/api/users/{username}")
		.buildAndExpand(result.getUsername()).toUri();
		
		return ResponseEntity.created(location).body(new ApiResponse(true, "User registered successfully"));

	}

	@Override
	public ResponseEntity<?> authenticateUser(@Valid LoginRequest loginRequest) {
		System.out.println(loginRequest.getUsernameOrEmail() +"|" + loginRequest.getPassword());
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsernameOrEmail(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);

		User user = usrRepo.findByUsername(loginRequest.getUsernameOrEmail());
		String jwt = tokenProvider.generateToken(authentication,user.getId());
		System.out.println("*****************Login Calling*******************");
			
		return ResponseEntity.ok(new JwtAuthenticationResponse(jwt, user.getId()));
	}

}
