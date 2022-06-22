package com.waruni96.emergency_excercise.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.waruni96.emergency_excercise.model.DistanceRange;

public interface DistanceRangeRepo extends JpaRepository<DistanceRange,Integer > {

	DistanceRange findByAccId(int accId);
}
