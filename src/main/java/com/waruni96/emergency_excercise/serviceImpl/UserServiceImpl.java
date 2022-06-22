package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.SignInRequest;
import com.waruni96.emergency_excercise.model.User;
import com.waruni96.emergency_excercise.repo.UserRepo;
import com.waruni96.emergency_excercise.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo userRepo;
	
	@Override
	public String saveUser(User user) {
		userRepo.save(user);
		return "SUCCESS";
	}

	@Override
	public User getUserByUsername(String username) {		
		return userRepo.findByUsername(username);
	}

	@Override
	public String userSignIn(SignInRequest req) {
		String response ="";
		String username = req.getUsername();
		User user = userRepo.findByUsername(username);
		
		if(user.getPassword().trim().equals(req.getPassword().trim())) {
			return user.getId()+"";
		}
		else {
			return "0";
		}
		
	}

	@Override
	public User findById(int id) {	
		return userRepo.findById(id);
	}

	@Override
	public boolean findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepo.existsUserByUsername(username);
	}
	
	

}
