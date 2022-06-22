package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.Sources;
import com.waruni96.emergency_excercise.repo.SourcesRepo;
import com.waruni96.emergency_excercise.service.SourcesService;

@Service
public class SourcesServiceImpl implements SourcesService{

	@Autowired
	SourcesRepo sourceRepo;
	
	@Override
	public List<Sources> getAll() {
		List<Sources> sls = sourceRepo.findAll();	
		return sls;
	}

	@Override
	public float getCurrentActivity(float initialActivity, float duration, int srcId) {
		float result = sourceRepo.getCurrentActivity(initialActivity, duration, srcId);
		return result;
	}

	@Override
	public float getAccurateSafetyDistance(float doseReading, float currentActivity, int srcId) {
		float result = sourceRepo.getAccurateSafetyDistance(doseReading, currentActivity, srcId);
		return result;
	}

}
