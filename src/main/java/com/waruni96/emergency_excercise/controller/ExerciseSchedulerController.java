package com.waruni96.emergency_excercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waruni96.emergency_excercise.model.ExerciseSceduler;
import com.waruni96.emergency_excercise.model.Instructions;
import com.waruni96.emergency_excercise.service.ExerciseSchedularService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class ExerciseSchedulerController {

	@Autowired
	ExerciseSchedularService exerciseSchedularService;
	
	@PostMapping("/addex")
	public String saveExerciseSchedule(@RequestBody ExerciseSceduler es){
		return exerciseSchedularService.SaveExerciseSchedule(es);
	}
	
	@GetMapping("/exdaily")
	public List<ExerciseSceduler> getDailyScheduledExcersices() { 		
		List<ExerciseSceduler> ls = exerciseSchedularService.getDailyScheduledExcersices();		
		return ls ;
	}
		
	@GetMapping("exlist/{date1}/{date2}")
	public List<ExerciseSceduler> getTransBydates(@PathVariable(value = "date1") String date1, @PathVariable(value = "date2") String date2) { 
				   
		List<ExerciseSceduler> ls = exerciseSchedularService.getExercisesByDateBetween(date1, date2);
		return ls;
	}
	
}
