package com.waruni96.emergency_excercise.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waruni96.emergency_excercise.model.ThreatCategory;
import com.waruni96.emergency_excercise.service.ThreatCategoryService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)  
public class ThreatCategoryController {

	@Autowired
	ThreatCategoryService threatCategoryService;
	
	@GetMapping("/threatcat")
	public List<ThreatCategory> getAllTheatCat(){
		System.out.println("threat cat get");
		List<ThreatCategory> thls = threatCategoryService.getAll();
		return thls;
	}
}
