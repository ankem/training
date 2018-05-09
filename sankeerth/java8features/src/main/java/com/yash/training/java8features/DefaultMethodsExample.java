package com.yash.training.java8features;


/**
 * Modifying one interface in JDK framework breaks all classes that extends the interface which means that adding 
 * any new method could break millions of lines of code. 
 * Therefore, default methods have introduced as a mechanism to extending interfaces in a backward compatible way.
 * 
 * Default methods can be provided to an interface without affecting implementing classes as it includes an implementation. 
 * If each added method in an interface defined with implementation then no implementing class is affected. 
 * An implementing class can override the default implementation provided by the interface.
 */

public class DefaultMethodsExample implements Interface1{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DefaultMethodsExample example = new DefaultMethodsExample();
		example.log("Default methods in interfaces - Java 8 feature");
			
	}

	@Override
	public void method1(String str) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
