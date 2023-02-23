package com.cogent.java8Optional.dateTime;



import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DataTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date dateinfo = new Date();
		System.out.println(dateinfo.toLocaleString());
		
		//
//		LocalDate dateinfo =new 
		System.out.println(dateinfo);
		
		LocalDate localDate = LocalDate.now();
		LocalDate dateinfo2 = LocalDate.now();
		
		System.out.println(dateinfo2.getDayOfMonth());
		
		
		/////////////////////////////////////////
		
		System.out.println("time zone Based..");
		// Get the current date and time
	      ZonedDateTime date1 = ZonedDateTime.parse("2007-12-03T10:15:30+05:30[Asia/Karachi]");
	      System.out.println("date1: " + date1);
			
	      ZoneId id = ZoneId.of("Europe/Paris");
	      System.out.println("ZoneId: " + id);
//			
	      ZoneId currentZone = ZoneId.systemDefault();
	      System.out.println("CurrentZone: " + currentZone);
		

	}

}

