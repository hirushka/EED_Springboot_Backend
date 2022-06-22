package com.waruni96.emergency_excercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.model.Drills;
import com.waruni96.emergency_excercise.service.DrillService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class DrillController {
	
	@Autowired 
	DrillService drillService;
	
	@GetMapping("/getallet")
	public List<Drills> getAllDrills(){
		List<Drills> ls = drillService.getAll();
		return ls;
	}

}
