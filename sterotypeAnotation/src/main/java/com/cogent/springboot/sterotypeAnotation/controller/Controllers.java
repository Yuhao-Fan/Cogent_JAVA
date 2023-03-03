package com.cogent.springboot.sterotypeAnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cogent.springboot.sterotypeAnotation.service.MyServiceClass;
import com.cogent.springboot.sterotypeAnotation.DAO_repo.*;

@Controller
public class Controllers {

	
	@Autowired
	MyServiceClass serviceClass;
	@Autowired
	MyRepo myRepo;
	
    @GetMapping("/hello" )
    @ResponseBody
    public String hello()
    {
    	
    	int res=serviceClass.factorial(5);
        return "Hello All ,Exporing Stereotype Annotations "+ res;
    }
    @GetMapping("/repo" )
    @ResponseBody
    public String repo()
    {
    	
    	int res=myRepo.disp();
        return "Hello All ,Exporing Stereotype REpo "+ res;
    }
    @RequestMapping(value = "info", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosBySimplePath() {
        return "Get some info about http Method";
    }

	
	
}

