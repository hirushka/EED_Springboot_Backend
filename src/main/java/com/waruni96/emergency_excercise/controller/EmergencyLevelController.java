package com.waruni96.emergency_excercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.waruni96.emergency_excercise.model.EmergencyLevel;
import com.waruni96.emergency_excercise.service.EmergencyLevelService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class EmergencyLevelController {

	@Autowired
	EmergencyLevelService emergencyLevelService;
	
	@GetMapping("/emelevel")
	public List<EmergencyLevel> getAllEmergencyLevel(){
		System.out.println("eme level get");
		List<EmergencyLevel> thls = emergencyLevelService.getAll();
		return thls;
	}
}
