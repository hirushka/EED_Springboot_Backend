package com.waruni96.emergency_excercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.waruni96.emergency_excercise.model.EmergencyLevel;


public interface EmergencyLevelRepo extends JpaRepository<EmergencyLevel,Integer > {

}
