package com.cogent.springboot.sterotypeAnotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SterotypeAnotationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SterotypeAnotationApplication.class, args);
	}

}
