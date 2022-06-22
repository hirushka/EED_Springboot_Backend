package com.waruni96.emergency_excercise.controller;

import java.net.URI;
import java.util.concurrent.ExecutionException;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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



@RestController
@RequestMapping("/api/auth")
public class AuthController {

	@Autowired
	UserRepo usrRepo;
	
	@Autowired
	UserDetailsRepo usrDRepo;

	@Autowired
    AuthenticationManager authenticationManager;

	@Autowired
    PasswordEncoder passwordEncoder;

	@Autowired
	JwtTokenProvider tokenProvider;
	
	@Autowired
	AuthService authService;

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {

		return authService.authenticateUser(loginRequest);
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) throws ExecutionException, InterruptedException {
		return authService.registerUser(signUpRequest);
	}

}
