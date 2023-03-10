package com.cogent.Batch65_SpringBootOne.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBootOne.entity.Employee;
import com.cogent.Batch65_SpringBootOne.exceptions.ResourceNotFoundException;
import com.cogent.Batch65_SpringBootOne.repo.EmployeeRepository;

import jakarta.validation.Valid;

@RestController
public class EmployeeController {

//	HTTP Methods
//	   GET
//	   POST
//	   DELETE
//	   PUT
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	

	@PostMapping("addemp")          //So @Valid - need to Activate Validation
	public Employee addEmployee(@Valid @RequestBody Employee newEmployee) {
		System.out.println("Adding record to database");
		    return employeeRepository.save(newEmployee);   //insert SQL - jdbc- MySQL

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
		
		if(!employeeRepository.findById(empid).isPresent()) {
			System.out.println("bbb");
			throw new ResourceNotFoundException("aaa");
		}
		employeeRepository.deleteById(empid);
	}

	
	@PutMapping("/updateemp/{id}")
	  public ResponseEntity<Employee> updateTutorial(@PathVariable("id") int id, @RequestBody Employee newEmpupdate) {
	    Optional<Employee> existingEmp = employeeRepository.findById(id); //existind old data

	    if (existingEmp.isPresent()) {   // data not blank  then update with New Data
	    	
	      Employee tempEmp = existingEmp.get();
	      
	      tempEmp.setName(newEmpupdate.getName());
	      tempEmp.setDept(newEmpupdate.getDept());
	      tempEmp.setSalary(newEmpupdate.getSalary());
	      return new ResponseEntity<>(employeeRepository.save(tempEmp), HttpStatus.OK);
	      
	    } else {                                //No data with id is Matched
	    	throw new ResourceNotFoundException("DAta Not Threr");
	      //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	    }
	  }
	
	
	
	





}

