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
import com.waruni96.emergency_excercise.model.Instructions;
import com.waruni96.emergency_excercise.service.InstructionService;

@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class InstructionController {

	@Autowired 
	InstructionService instructionService;
	
	@PostMapping("/addinstr")
	public String saveInstructionsForAccidentTypes(@RequestBody Instructions instr){
		return instructionService.addInstruction(instr);
	}
	
	@GetMapping("/getinstracc/{accId}")
	public Instructions getAllInstructionsForAccidentType(@PathVariable(value = "accId") int accId){
		Instructions ls = instructionService.getInstructionsByAccId(accId);
		return ls;
	}
}
