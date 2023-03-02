package com.cogent.Batch65_SpringBootOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.cogent.Batch65_SpringBootOne.controller.Controller;

@SpringBootApplication
//@ComponentScan(basePackageClasses = Controller.class)
public class Batch65SpringBootOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(Batch65SpringBootOneApplication.class, args);
	}

}
