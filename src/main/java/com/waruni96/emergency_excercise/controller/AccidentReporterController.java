package com.waruni96.emergency_excercise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.waruni96.emergency_excercise.model.AccidentReporter;
import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.service.AccidentReportService;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class AccidentReporterController {
	
	@Autowired
	AccidentReportService accidentReportService;
	
	@PostMapping("/addaccr")
	public String saveAccidentReports(@RequestBody AccidentReporter ar){
		return accidentReportService.SaveAccidentReport(ar);
	}
}
