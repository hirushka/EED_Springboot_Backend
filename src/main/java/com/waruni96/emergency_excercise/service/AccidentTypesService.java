package com.waruni96.emergency_excercise.service;

import java.util.List;

import com.waruni96.emergency_excercise.dto.AccidentTypesDto;
import com.waruni96.emergency_excercise.model.AccidentTypes;

public interface AccidentTypesService {

	String addAccidentType(AccidentTypes act);
	List<AccidentTypes> getAcctidentTypesByTcIdAndLvIdAndLId(int tcId, int lvId, int lcId);
	List<AccidentTypes> getAllAccidentTypes();
	List<AccidentTypes> getAccidentsByName(String accName);
}
