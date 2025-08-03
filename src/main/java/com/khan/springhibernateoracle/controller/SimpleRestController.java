package com.khan.springhibernateoracle.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.khan.springhibernateoracle.model.Employee;
import com.khan.springhibernateoracle.service.EmployeeService;

import jakarta.servlet.http.HttpServletResponse;

@RestController
public class SimpleRestController {

	@Autowired
	public EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, path = "/empList", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> getEmpList() {
		List<Employee> empList = employeeService.fetchAllEmp();
		return ResponseEntity.ok(empList);

	}

	@RequestMapping(method = RequestMethod.GET, path = "/emp/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> getEmpList(@PathVariable Long empId) {
		Employee emp = employeeService.fetchEmpbyId(empId);
		// Employee emp = employeeService.fetchEmpbyId(Long.parseLong(empId));
		return ResponseEntity.ok(emp);

	}

	@RequestMapping(method = RequestMethod.GET, path = "/empHeader/{empId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<Employee> getEmpListWithHeader(@PathVariable Long empId, 
										@RequestHeader HttpHeaders headers,
										HttpServletResponse response) {
		Employee emp = employeeService.fetchEmpbyId(empId);

		if (emp.getFirstName().length() > 0) {
			response.setHeader("empFound", "true"); // OR addHeader
		} else {
			response.setHeader("empFound", "false"); // OR addHeader
		}

		return ResponseEntity.ok(emp);

	}

}
