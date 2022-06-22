package com.waruni96.emergency_excercise.service;

import java.util.List;

import com.waruni96.emergency_excercise.model.Instructions;

public interface InstructionService {

	Instructions getInstructionsByAccId(int accid);
	String addInstruction(Instructions instr);
}
