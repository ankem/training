package com.yash.training.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateTimeAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate today = LocalDate.now();
		System.out.println("Current Date="+today);
		
		//Creating LocalDate by providing input arguments
		LocalDate firstDay = LocalDate.of(2014, Month.JANUARY, 1);
		System.out.println("Specific Date="+firstDay);
		
		LocalTime time = LocalTime.now();
		System.out.println("Current Time="+time);
		
		//Creating LocalTime by providing input arguments
		LocalTime specificTime = LocalTime.of(12,20,25,40);
		System.out.println("Specific Time of Day="+specificTime);
		
		LocalDateTime today2 = LocalDateTime.now();
		System.out.println("Current DateTime="+today2);
		
		//Current Date using LocalDate and LocalTime
		today2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current DateTime="+today2);
	}
}
