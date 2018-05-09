package com.yash.java;

import java.util.List;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.security.SecureRandom;

public class TriplesOfEvenIntegers {
    public static void main(String[] args){

        IntPredicate even = (x)-> (x % 2 == 0);

        int myIntegers = IntStream.rangeClosed(2, 10).filter(even).map(j -> j*3).sum();
        System.out.println(myIntegers);

    }
}
