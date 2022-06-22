package com.waruni96.emergency_excercise.service;

import java.util.Map;

import com.waruni96.emergency_excercise.model.Employee;

public interface EmployeeRepo {

	
	void saveEmployee(Employee emp);
    Employee getOneEmployee(Integer id);
    void updateEmployee(Employee emp);
    Map<Integer, Employee> getAllEmployees();
    void deleteEmployee(Integer id);
    void saveAllEmployees(Map<Integer, Employee> map);
}
