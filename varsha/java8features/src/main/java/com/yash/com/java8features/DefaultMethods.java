package com.yash.com.java8features;

interface I1{
	
	default void display() {
		System.out.println("Default method to print"); 
	}
	
	void add(int a, int b);
}

public class DefaultMethods implements I1 {
	
	public void add(int a, int b) {
		System.out.println(a+b); 
	}
	
	public static void main(String[] args) {
		
		DefaultMethods dm = new DefaultMethods();
		dm.display();
		dm.add(10,5);
	}
}  