package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.ThreatCategory;
import com.waruni96.emergency_excercise.repo.ThreatCategoryRepo;
import com.waruni96.emergency_excercise.service.ThreatCategoryService;

@Service
public class ThreatCategoryServiceImpl implements ThreatCategoryService {

	@Autowired
	ThreatCategoryRepo threatCategoryRepo;
	
	@Override
	public List<ThreatCategory> getAll() {
		List<ThreatCategory> thls = threatCategoryRepo.findAll();
		return thls;
	}

}
