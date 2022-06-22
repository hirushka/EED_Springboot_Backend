package com.waruni96.emergency_excercise.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waruni96.emergency_excercise.model.Employee;
import com.waruni96.emergency_excercise.service.EmployeeRepo;


@RestController
@RequestMapping("/api/eed")
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600) 
public class EmployeeController {
	
	@Autowired 
	EmployeeRepo empRepo;
	
	@GetMapping("/getemp")
	public Map<Integer, Employee> getAllDrills(){
		Map<Integer, Employee> ls = empRepo.getAllEmployees();
		return ls;
	}
	
	@PostMapping("/addemp")
	public String saveAccidentReports(@RequestBody Employee emp){
		 empRepo.saveEmployee(emp);
		 return "SUCCESS";
	}
}
