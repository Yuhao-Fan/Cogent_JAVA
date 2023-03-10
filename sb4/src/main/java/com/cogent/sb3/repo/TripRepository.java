package com.cogent.sb3.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.sb3.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Integer> {
	
	//by default Lots of Methods Available that will do Some 
	//Magic to deal with database Connect and Query....by differen ways

}

