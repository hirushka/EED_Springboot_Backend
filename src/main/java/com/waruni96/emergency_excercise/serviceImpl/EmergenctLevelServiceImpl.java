package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.EmergencyLevel;
import com.waruni96.emergency_excercise.repo.EmergencyLevelRepo;
import com.waruni96.emergency_excercise.service.EmergencyLevelService;

@Service
public class EmergenctLevelServiceImpl implements EmergencyLevelService{

	@Autowired
	EmergencyLevelRepo emergenctLevelRepo;
	
	@Override
	public List<EmergencyLevel> getAll() {
		List<EmergencyLevel> emls = emergenctLevelRepo.findAll();
		return emls;
	}

}
