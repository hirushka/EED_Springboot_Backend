package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.Instructions;
import com.waruni96.emergency_excercise.repo.InstructionRepo;
import com.waruni96.emergency_excercise.service.InstructionService;
@Service
public class InstructionServiceImpl implements InstructionService{

	@Autowired
	InstructionRepo instructionRepo;
	
	@Override
	public Instructions getInstructionsByAccId(int accId) {
		Instructions ls = instructionRepo.findByAccId(accId);
		return ls;
	}

	@Override
	public String addInstruction(Instructions instr) {
		instructionRepo.save(instr);
		return "SUCESS";
	}

}
