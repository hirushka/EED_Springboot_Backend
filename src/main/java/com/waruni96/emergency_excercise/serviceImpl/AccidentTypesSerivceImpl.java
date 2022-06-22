package com.waruni96.emergency_excercise.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.dto.AccidentTypesDto;
import com.waruni96.emergency_excercise.model.AccidentTypes;
import com.waruni96.emergency_excercise.repo.AccidentTypesRepo;
import com.waruni96.emergency_excercise.service.AccidentTypesService;


@Service
public class AccidentTypesSerivceImpl implements AccidentTypesService{

	@Autowired
	private AccidentTypesRepo accidentTypesRepo;
	
	//@Autowired
	//private AccidentTypesMapper accidentTypesMapper;
	
	@Override
	public String addAccidentType(AccidentTypes act) {
		accidentTypesRepo.save(act);
		return "SUCESS";
	}

	@Override
	public List<AccidentTypes> getAcctidentTypesByTcIdAndLvIdAndLId(int tcId, int lvId, int lcId) {
		List<AccidentTypes> ls = accidentTypesRepo.search(tcId, lvId, lcId);
		return ls;
	}

	@Override
	public List<AccidentTypes> getAllAccidentTypes() {
		
		List<AccidentTypes> ls = accidentTypesRepo.findAll();
		 //return ls.stream().map(accidentTypesMapper::toDto).collect(Collectors.toList());
		return ls;
	}

	@Override
	public List<AccidentTypes> getAccidentsByName(String accName) {
		List<AccidentTypes> ls = accidentTypesRepo.findByAccName(accName);
		return ls;
	}

}
