package com.cogent.springboot.sterotypeAnotation.DAO_repo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("classpath:oracledatabase.properties")
public class MyRepo {
	@Value("99")
	int info;    //to Assing Value to Varable...
	@Value("${server.port}")  //New
    private String apacheserver_port;


    @Value("${db.port}")  //New
    private String portno;
    
	
	public int disp() {
		System.out.println("port number read is "+portno);
		System.out.println("apacheserver_port port number read is "+apacheserver_port);
		return info;
	}

}


