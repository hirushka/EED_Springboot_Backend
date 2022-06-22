package com.waruni96.emergency_excercise.service;

import java.util.List;

import com.waruni96.emergency_excercise.model.ExerciseSceduler;

public interface ExerciseSchedularService {

	public String SaveExerciseSchedule(ExerciseSceduler es);
	public List<ExerciseSceduler> getDailyScheduledExcersices();
	public List<ExerciseSceduler> getExercisesByDateBetween(String start, String end);
}
