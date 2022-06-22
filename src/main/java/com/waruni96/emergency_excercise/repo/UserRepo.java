package com.waruni96.emergency_excercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.model.User;

public interface UserRepo extends JpaRepository<User,Integer > {

	User findByUsername(String username);
	boolean existsUserByUsername(String username);
	User findById(int id);
}
