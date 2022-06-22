package com.waruni96.emergency_excercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.model.User;
import com.waruni96.emergency_excercise.model.UserDetails;
import com.waruni96.emergency_excercise.service.UserDetailsService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class UserDetailsController {

	@Autowired
	UserDetailsService userDetailsService;
	
	@PostMapping("/addud")
	public UserDetails saveuserDetails(@RequestBody UserDetails ud){
		return userDetailsService.userDetailsSave(ud);
	}
	
	@GetMapping("/getudbyid/{id}")
	public List<UserDetails> getUserById(@PathVariable(value = "id") int id) {
		return userDetailsService.getUserDetailsById(id);
	}
	
	@GetMapping("/getud")
	public List<UserDetails> getAllUser() {
		return userDetailsService.getAllUserDetaild();
	}
}
