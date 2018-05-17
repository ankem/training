package com.yash.training.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * A new java.util.stream has been added in Java 8 to perform filter/map/reduce like operations with the collection.
 * Stream API will allow sequential as well as parallel execution.
 * This is one of the best feature for me because I work a lot with Collections and usually with Big Data,
 * we need to filter out them based on some conditions.
 * Collection interface has been extended with stream() and parallelStream() default methods to get the Stream for sequential and parallel execution.
 */
public class StreamAPI {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        List<Integer> myList = new ArrayList<>();
        for (int i = 0; i < 100; i++) myList.add(i);

        //sequential stream
        Stream<Integer> sequentialStream = myList.stream();

        //parallel stream
        Stream<Integer> parallelStream = myList.parallelStream();

        //using lambda with Stream API, filter example
        Stream<Integer> highNums = parallelStream.filter(p -> p > 90);
        highNums.forEach(p -> System.out.println("High Nums parallel=" + p));


        Stream<Integer> highNumsSeq = sequentialStream.filter(p -> p > 90);
        highNumsSeq.forEach(p -> System.out.println("High Nums sequential=" + p));
    }

    public IntStream getStreamGreaterThanTwenties(int[] inputArray) {
        return IntStream.of(inputArray).filter(e->e%20==0);
    }
}
