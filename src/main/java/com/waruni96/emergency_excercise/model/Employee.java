package com.waruni96.emergency_excercise.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("Employee")

public class Employee implements Serializable {

	private static final long serialVersionUID = -7817224776021728682L;

    private int empId;
    private String empName;
    private int empSalary;
    
	public Employee() {}
    
	public Employee(int i, String string, int d) {
		// TODO Auto-generated constructor stub
		this.empId = i;
		this.empName = string;
		this.empSalary = d;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	
	
	
}
