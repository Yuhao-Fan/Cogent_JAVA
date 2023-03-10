package com.cogent.sb3.controller;

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

import com.cogent.sb3.entity.Trip;
import com.cogent.sb3.exceptions.ResourceNotFoundException;
import com.cogent.sb3.repo.TripRepository;

import jakarta.validation.Valid;

@RestController
public class TripController {

//	HTTP Methods
//	   GET
//	   POST
//	   DELETE
//	   PUT
	
	
	@Autowired
	TripRepository TripRepository;
	

	@PostMapping("addTrip")          //So @Valid - need to Activate Validation
	public Trip addTrip(@Valid @RequestBody Trip newTrip) {
		System.out.println("Adding record to database");
		   return TripRepository.save(newTrip);   //insert SQL - jdbc- MySQL

	}
	




	@GetMapping("getTrip")
	public List<Trip> getTrip() {
		
		return TripRepository.findAll();
		
	}


	@DeleteMapping("deleteTrip/{id}")
	public void deleteTrip(@PathVariable("id") int Tripid)
	{
		
		if(!TripRepository.findById(Tripid).isPresent()) {
			throw new ResourceNotFoundException("delete Id NOT found");
		}
		TripRepository.deleteById(Tripid);
	}

	
	@PutMapping("/updateTrip/{id}")
	  public ResponseEntity<Trip> updateTrip(@PathVariable("id") int id, @RequestBody Trip newTripupdate) {
	    Optional<Trip> existingTrip = TripRepository.findById(id); //existind old data

		if (existingTrip.isPresent()) {   // data not blank  then update with New Data
	    	
	      Trip trip = existingTrip.get();
	      
	      trip.setName(newTripupdate.getName());
	      trip.setVeg(newTripupdate.isVeg());
	      trip.setKid(newTripupdate.getKid());
	      return new ResponseEntity<>(TripRepository.save(trip), HttpStatus.OK);
	      
	    } else {                                //No data with id is Matched
	    	throw new ResourceNotFoundException("DAta Not Threr");
	      //return new ResponseEntity<>( HttpStatus.NOT_FOUND);
	    }
	  }
	
	
	
	





}

