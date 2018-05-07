package com.yash.training.java8features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;


/**
 * 
 * forEach method helps in having the iteration logic and business logic at separate place 
 *  resulting in higher separation of concern and cleaner code.
 *
 */
public class Java8ForEachExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			myList.add(i);


		// traversing through forEach method of Iterable with anonymous class
		myList.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
//				System.out.println("forEach anonymous class Value::" + t);
			}

		});

		// traversing with Consumer interface implementation
		MyConsumer action = new MyConsumer();
		myList.forEach(action);

	}
}

// Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer> {

	public void accept(Integer t) {
		// TODO Auto-generated method stub
		System.out.println("forEach anonymous class Value::" + t);
	}
}
