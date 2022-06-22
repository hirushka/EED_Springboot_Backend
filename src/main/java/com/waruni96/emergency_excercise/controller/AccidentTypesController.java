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

import com.waruni96.emergency_excercise.dto.AccidentTypesDto;
import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.service.AccidentTypesService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class AccidentTypesController {
	
	@Autowired 
	AccidentTypesService accidentTypesService;
	
	@PostMapping("/addacc")
	public String saveAccidentTypes(@RequestBody AccidentTypes act){
		return accidentTypesService.addAccidentType(act);
	}
	
	@GetMapping("/acc/{tcId}/{lvId}/{lcId}")
	public List<AccidentTypes> getTransBydates(@PathVariable(value = "tcId") int tcId, @PathVariable(value = "lvId") int lvId, @PathVariable(value = "lcId") int lcId ) { 
				   
		List<AccidentTypes> ls = accidentTypesService.getAcctidentTypesByTcIdAndLvIdAndLId(tcId, lvId, lcId);
		return ls;
	}
	
	@GetMapping("/getallacc")
	public List<AccidentTypes> getAllAccidentType(){
		List<AccidentTypes> ls = accidentTypesService.getAllAccidentTypes();
		return ls;
	}
	
	@GetMapping("/getaccbyname/{accName}")
	public List<AccidentTypes> getAllAccidentByName(@PathVariable(value = "accName") String accName){
		List<AccidentTypes> ls = accidentTypesService.getAccidentsByName(accName);
		return ls;
	}
}
