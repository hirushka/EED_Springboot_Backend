package com.waruni96.emergency_excercise.service;

import com.waruni96.emergency_excercise.model.SignInRequest;
import com.waruni96.emergency_excercise.model.User;

public interface UserService {

	String saveUser(User user);
	User getUserByUsername(String username);
	String userSignIn(SignInRequest req);
	User findById(int id);
	boolean findByUsername(String username);
}
