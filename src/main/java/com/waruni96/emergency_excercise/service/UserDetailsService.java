package com.waruni96.emergency_excercise.service;

import java.util.List;

import com.waruni96.emergency_excercise.model.UserDetails;

public interface UserDetailsService {

	UserDetails userDetailsSave(UserDetails usr);
	List<UserDetails> getUserDetailsById(int id);
	List<UserDetails> getAllUserDetaild();
}
