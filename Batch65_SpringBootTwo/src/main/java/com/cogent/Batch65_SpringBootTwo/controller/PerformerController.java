package com.cogent.Batch65_SpringBootTwo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Batch65_SpringBootTwo.entity.Performer;
import com.cogent.Batch65_SpringBootTwo.repo.PerformerRepository;

@RestController
public class PerformerController {

//	HTTP Methods
//	   GET
//	   POST
//	   DELETE
//	   PUT
	
	
	@Autowired
	PerformerRepository performerRepository;
	

	@PostMapping("/add")
	public Performer newPerformer(@RequestBody Performer newPerformer) {
	    return performerRepository.save(newPerformer);
	 }


	@GetMapping("/get")
	public List<Performer> getPerformers() {
		
		return performerRepository.findAll();
		
	}



	@PutMapping("/put")  
	private Performer updatePerformer(@RequestBody Performer newPerformer)   
	{  
		performerRepository.save(newPerformer);  
		return newPerformer;  
	}  

	@DeleteMapping("/delete/{id}")
	public void deletePerformer(@PathVariable("id") int empid)
	{
		performerRepository.deleteById(empid);
	}



}

