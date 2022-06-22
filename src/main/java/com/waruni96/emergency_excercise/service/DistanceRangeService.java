package com.waruni96.emergency_excercise.service;

import com.waruni96.emergency_excercise.model.DistanceRange;

public interface DistanceRangeService {

	String SaveDistance(DistanceRange dr);
	DistanceRange getDistanceByAccId(int accId);
}
