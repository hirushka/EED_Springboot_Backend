package com.waruni96.emergency_excercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waruni96.emergency_excercise.model.AccidentReporter;
import com.waruni96.emergency_excercise.model.AccidentTypes;

public interface AccidentReporterRepo extends JpaRepository<AccidentReporter,Integer >{

}
