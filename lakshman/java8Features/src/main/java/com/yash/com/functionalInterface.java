package com.yash.com;

@FunctionalInterface
interface things{
	void table(String msg);  //abstract method
}

public class functionalInterface implements things {

	  public void table(String msg){  
	        System.out.println(msg);  
	    }  
	public static void main(String[] args) {
		functionalInterface f1 = new functionalInterface();
		f1.table("Hello this is table");
		
	}
}
