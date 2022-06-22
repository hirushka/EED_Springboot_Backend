package com.waruni96.emergency_excercise.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.waruni96.emergency_excercise.model.ExerciseSceduler;

public interface ExerciseScedulerRepo extends JpaRepository<ExerciseSceduler,Integer > {

	List<ExerciseSceduler> findBySceduledDateBetween(String startDate, String endDate);
}
