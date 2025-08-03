package com.khan.springhibernateoracle.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.khan.springhibernateoracle.model.Employee;
import com.khan.springhibernateoracle.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;
	
	public EmployeeService() {
		// TODO Auto-generated constructor stub
	}
	
	public List<Employee> fetchAllEmp() {
		return employeeRepository.findAll();
		
	}
	
	public Employee fetchEmpbyId( long empId) {
		Optional<Employee> empOpt = employeeRepository.findById(empId);
		return empOpt.orElse(new Employee());
		
	}

}
