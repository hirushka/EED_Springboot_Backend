package com.waruni96.emergency_excercise.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.model.UserDetails;

public interface UserDetailsRepo extends JpaRepository<UserDetails,Integer >{
	
	List<UserDetails> findById(int id);

}
