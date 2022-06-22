package com.waruni96.emergency_excercise.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waruni96.emergency_excercise.model.Location;
import com.waruni96.emergency_excercise.repo.LocationRepo;
import com.waruni96.emergency_excercise.service.LocationService;

@Service
public class LocationSerivceImpl implements LocationService{

	@Autowired
	LocationRepo locationRepo;
	
	@Override
	public List<Location> getAll() {
		List<Location> ls= locationRepo.findAll();
		return ls;
	}

}
