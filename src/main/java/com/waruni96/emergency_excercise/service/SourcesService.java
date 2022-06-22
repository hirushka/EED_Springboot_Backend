package com.waruni96.emergency_excercise.service;

import java.util.List;

import com.waruni96.emergency_excercise.model.Sources;

public interface SourcesService {

	List<Sources> getAll();
	float getCurrentActivity(float initialActivity, float duration,int srcId);
	float getAccurateSafetyDistance( float doseReading, float currentActivity,int srcId);
}
