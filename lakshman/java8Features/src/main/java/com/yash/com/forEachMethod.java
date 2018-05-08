package com.yash.com;

import java.util.ArrayList;
import java.util.List;

public class forEachMethod {

	public static void main(String[] args) {
		List<String> things = new ArrayList<String>();
		things.add("table");
		things.add("chair");
		things.add("bottle");
		things.add("cup");
		
		System.out.println("Iterating by passing Lambda expressions");
		things.forEach(thing -> System.out.println(thing));   //using forEach() Method
		things.stream().forEachOrdered(thing -> System.out.println(thing)); //using Java Stream forEachOrdered() Method
		
		System.out.println("Iterating by passing method reference");
		things.forEach(System.out::println);   //using forEach() Method
		things.stream().forEachOrdered(System.out::println); //using Java Stream forEachOrdered() Method.
	}
}
