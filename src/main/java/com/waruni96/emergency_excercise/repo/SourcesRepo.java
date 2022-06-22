package com.waruni96.emergency_excercise.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.waruni96.emergency_excercise.dto.CurrentActivity;
import com.waruni96.emergency_excercise.model.Sources;

public interface SourcesRepo extends JpaRepository<Sources,Integer >{

	@Query(value= "{call get_current_activity(:initialActivity,:duration,:srcId)}" , nativeQuery = true)
	float getCurrentActivity(
			@Param("initialActivity") float initialActivity,
			@Param("duration") float duration,
			@Param("srcId") int srcId
			);
	
	@Query(value= "{call get_accurate_safety_distance(:doseReading,:currentActivity,:srcId)}" , nativeQuery = true)
	float getAccurateSafetyDistance(
			@Param("doseReading") float doseReading,
			@Param("currentActivity") float currentActivity,
			@Param("srcId") int srcId
			);
}
