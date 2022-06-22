package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.UserDetails;
import com.waruni96.emergency_excercise.repo.UserDetailsRepo;
import com.waruni96.emergency_excercise.service.UserDetailsService;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{

	@Autowired
	UserDetailsRepo userDetailsRepo;
	
	@Override
	public UserDetails userDetailsSave(UserDetails usr) {
		UserDetails ud =  userDetailsRepo.save(usr);
		return ud;
	}

	@Override
	public List<UserDetails> getUserDetailsById(int id) {
		
		return userDetailsRepo.findById(id);
	}

	@Override
	public List<UserDetails> getAllUserDetaild() {
		// TODO Auto-generated method stub
		return userDetailsRepo.findAll();
	}

}
