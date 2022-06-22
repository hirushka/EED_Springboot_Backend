package com.waruni96.emergency_excercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.model.SignInRequest;
import com.waruni96.emergency_excercise.model.User;
import com.waruni96.emergency_excercise.service.UserService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/adduser")
	public String saveAccidentTypes(@RequestBody User usr){
		return userService.saveUser(usr);
	}
	
	@PostMapping("/signin")
	public String userSignIn(@RequestBody SignInRequest req) {
		return userService.userSignIn(req);
	}
	
	@GetMapping("/getuserbyid/{id}")
	public User getUserById(@PathVariable(value = "id") int id) {
		return userService.findById(id);
	}
	
	@GetMapping("/userexist/{username}")
	public boolean isUserExist(@PathVariable(value= "username") String username) {
		return userService.findByUsername(username);
	}
}
