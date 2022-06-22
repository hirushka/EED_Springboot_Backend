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

import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.model.DistanceRange;
import com.waruni96.emergency_excercise.service.DistanceRangeService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class DistanceRangeController {

	@Autowired
	DistanceRangeService distanceRangeService;
	
	@PostMapping("/addmindis")
	public String saveMidDistance(@RequestBody  DistanceRange dr){
		return distanceRangeService.SaveDistance(dr);
	}
	@GetMapping("/mindis/{accId}")
	public DistanceRange getMinDistance(@PathVariable(value = "accId") int accId) { 
		DistanceRange dr = distanceRangeService.getDistanceByAccId(accId);		   		
		return dr;
	}
}
