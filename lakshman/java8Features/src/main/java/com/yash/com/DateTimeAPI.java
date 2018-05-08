package com.yash.com;

import java.time.LocalDate;
//import java.time.Month;
import java.time.ZoneId;

public class DateTimeAPI {

public static void main(String[] args) {
		
		//Current Date
		LocalDate today = LocalDate.now();
		System.out.println("Current Date="+today);
		
		//Creating LocalDate by providing input arguments
		LocalDate Birthday = LocalDate.of(1992, 05, 02);
		System.out.println("Specific Date="+Birthday);
		
		//Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST="+todayKolkata);

		//java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
		//LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));
		
		//Getting date from the base date i.e 01/01/1970
		LocalDate dateFromBase = LocalDate.ofEpochDay(365);
		System.out.println("365th day from base date= "+dateFromBase);
		
		LocalDate hundredDay2018 = LocalDate.ofYearDay(2018, 100);
		System.out.println("100th day of 2014="+hundredDay2018);
	}

}
