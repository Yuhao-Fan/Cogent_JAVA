package com.cogent.Batch65_SpringBootOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBootOne.entity.Employee;
import com.cogent.Batch65_SpringBootOne.repo.EmployeeRepository;

@RestController
public class EmployeeController {

//	HTTP Methods
//	   GET
//	   POST
//	   DELETE
//	   PUT
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	

	@PostMapping("addemp")
	public Employee newEmployee(@RequestBody Employee newEmployee) {
	    return employeeRepository.save(newEmployee);
	 }


	@GetMapping("getemp")
	public List<Employee> getEmployee() {
		
	return employeeRepository.findAll();
		
	}

	@PutMapping
	void updateEmployee() {

	}


	@DeleteMapping("deleteemp/{id}")
	public void deleteEmployee(@PathVariable("id") int empid)
	{
		employeeRepository.deleteById(empid);
	}



}

