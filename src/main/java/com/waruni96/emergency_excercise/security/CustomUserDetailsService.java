package com.waruni96.emergency_excercise.security;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.*;
import com.waruni96.emergency_excercise.repo.UserRepo;
@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepo userRepo;

	@Override
//	@Transactional
	public UserDetails loadUserByUsername(String username)  {


		User user = null;

		try {
			//user = userFirebaseService.getUser(username);
			System.out.println(username);
			//System.out.println("*************************************"+userRepo.findByUsername(username).getUsername());
			user = userRepo.findByUsername(username);
			
			return UserPrincipal.create(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return UserPrincipal.create(user);
	}

	// This method is used by JWTAuthenticationFilter
//	@Transactional
	public UserDetails loadUserById(String id) throws ExecutionException, InterruptedException {

		//User user = userFirebaseService.getUser(id);
		User user = userRepo.findByUsername(id);
		
		return UserPrincipal.create(user);
	}

}
