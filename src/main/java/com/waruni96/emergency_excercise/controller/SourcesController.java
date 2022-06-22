package com.waruni96.emergency_excercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waruni96.emergency_excercise.model.Sources;
import com.waruni96.emergency_excercise.service.SourcesService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class SourcesController {

	@Autowired
	SourcesService sourcesService;
	
	@GetMapping("/src")
	List<Sources> getAllSources(){
		List<Sources> sls = sourcesService.getAll();
		return sls;
	}
	
	@GetMapping("/src/getCurrentActivity/{initialActivity}/{duration}/{srcId}")
	public float getCurrentActivity(@PathVariable(value = "initialActivity") float initialActivity,@PathVariable(value = "duration") float duration,@PathVariable(value = "srcId") int srcId) {
		float result = sourcesService.getCurrentActivity(initialActivity, duration, srcId);
		return result;
	}
	
	@GetMapping("/src/getAccurateSafetyDistance/{doseReading}/{currentActivity}/{srcId}")
	public float getAccurateSafetyDistance(@PathVariable(value = "doseReading") float doseReading,@PathVariable(value = "currentActivity") float currentActivity, @PathVariable(value = "srcId") int srcId) {
		float result = sourcesService.getAccurateSafetyDistance(doseReading, currentActivity, srcId);
		return result;
	}
}
