package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.Drills;
import com.waruni96.emergency_excercise.repo.DrillsRepo;
import com.waruni96.emergency_excercise.service.DrillService;

@Service
public class DrillServiceIpl implements DrillService{

	@Autowired
	DrillsRepo drillsRepo;
	
	@Override
	public List<Drills> getAll() {
		// TODO Auto-generated method stub
		return drillsRepo.findAll();
	}

}
