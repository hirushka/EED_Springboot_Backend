package com.waruni96.emergency_excercise.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.DistanceRange;
import com.waruni96.emergency_excercise.repo.DistanceRangeRepo;
import com.waruni96.emergency_excercise.service.DistanceRangeService;
@Service
public class DistanceServiceImpl implements DistanceRangeService{

	@Autowired
	DistanceRangeRepo distanceRangeRepo;
	@Override
	public String SaveDistance(DistanceRange dr) {
		distanceRangeRepo.save(dr);
		return "SUCCESS";
	}
	@Override
	public DistanceRange getDistanceByAccId(int accId) {
		DistanceRange dr = distanceRangeRepo.findByAccId(accId);
		return dr;
	}

}
