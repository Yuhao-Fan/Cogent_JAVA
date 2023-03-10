package com.cogent.sb3.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.sb3.entity.User;
import com.cogent.sb3.exceptions.ResourceNotFoundException;
import com.cogent.sb3.repo.UserRepository;

import jakarta.validation.Valid;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

//	HTTP Methods
//	   GET
//	   POST
//	   DELETE
//	   PUT
	
	
	@Autowired
	UserRepository userRepository;
	

	@PostMapping("addUser")          //So @Valid - need to Activate Validation
	public User addUser(@Valid @RequestBody User newUser) {
		System.out.println("Adding record to database");
		   return userRepository.save(newUser);   //insert SQL - jdbc- MySQL

	}
	




	@GetMapping("getUser")
	public List<User> getUser() {
		
		return userRepository.findAll();
		
	}


	@DeleteMapping("deleteUser/{id}")
	public void deleteUser(@PathVariable("id") int Userid)
	{
		
		if(!userRepository.findById(Userid).isPresent()) {
			throw new ResourceNotFoundException("delete Id NOT found");
		}
		userRepository.deleteById(Userid);
	}

	
	@PutMapping("/updateUser/{id}")
	  public ResponseEntity<User> updateUser(@PathVariable("id") int id, @RequestBody User newUserupdate) {
	    Optional<User> existingUser = userRepository.findById(id); //existind old data

		if (existingUser.isPresent()) {   // data not blank  then update with New Data
	    	
	      User User = existingUser.get();
	      
	      User.setUsername(newUserupdate.getUsername());
	      User.setPassword(newUserupdate.getPassword());
	      return new ResponseEntity<>(userRepository.save(User), HttpStatus.OK);
	      
	    } else {                                //No data with id is Matched
	    	throw new ResourceNotFoundException("DAta Not Threr");
	      //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	    }
	  }
	
	
	
	





}

