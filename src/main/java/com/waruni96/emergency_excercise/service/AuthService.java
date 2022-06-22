package com.waruni96.emergency_excercise.service;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;

import com.waruni96.emergency_excercise.dto.LoginRequest;
import com.waruni96.emergency_excercise.dto.SignUpRequest;

public interface AuthService {

	public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest);
	public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginRequest loginRequest);
}
