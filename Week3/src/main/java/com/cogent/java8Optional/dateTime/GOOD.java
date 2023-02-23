package com.cogent.java8Optional.dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class GOOD {
	public static void main(String[] args) {
		Date dateinfo = new Date();
		int hour = dateinfo.getHours();
		LocalTime dateinfo2 = LocalTime.now();
		System.out.println(dateinfo2.getHour());
		System.out.println(LocalDateTime.now().getHour());
		System.out.println(Calendar.HOUR_OF_DAY);
		System.out.println(ZonedDateTime.now().getHour());
		if (hour<12) {
			System.out.println("Good Morning");
		} else if (hour<18){
			System.out.println("Good Afternoon");

		}else {
			System.out.println("Good Evening");
		}
		
	}
}
