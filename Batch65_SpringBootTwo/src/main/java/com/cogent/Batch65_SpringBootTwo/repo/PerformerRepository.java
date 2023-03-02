package com.cogent.Batch65_SpringBootTwo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cogent.Batch65_SpringBootTwo.entity.Performer;

public interface PerformerRepository extends JpaRepository<Performer, Integer> {
	
	//by default Lots of Methods Available that will do Some 
	//Magic to deal with database Connect and Query....by differen ways

}

