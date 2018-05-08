package com.yash.com;

interface addnumbers{
	int add(int a, int b, int c);
}

public class LambdaExpression {
	
	public static void main(String[] args) {
		
		  // Multiple parameters in lambda expression 
		addnumbers a1 = (a,b,c) -> (a+b+c);
		System.out.println(a1.add(10, 5, 5));
		
		// Multiple parameters with data type in lambda expression  
		addnumbers a2 = (int a, int b, int c)  -> (a+b+c);
		System.out.println(a2.add(10, 5, 5));
	}

}
