package com.cogent.Batch65_SpringBootOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController      //Http Methods gets defined
public class Controller {
	
	//End Points URL for REST API
	
	@GetMapping("/hello")  //url endpoint for API
	public String hello() {
		
		return "<h1>Hello World</h1>";
		
	}
	@GetMapping("/add")  //url endpoint for API
	public String add() {
		int a = 50;
		int b = 111;
		int c = a+b;
		return "<h1>"+c+"</h1>";
		
	}
	
	
	
	
	
	

}

