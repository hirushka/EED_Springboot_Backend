package com.waruni96.emergency_excercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waruni96.emergency_excercise.model.Location;

public interface LocationRepo extends JpaRepository<Location,Integer >{

}
