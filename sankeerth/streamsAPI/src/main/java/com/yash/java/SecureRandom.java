package com.yash.java;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class SecureRandom {
    public static void main(String[] args){

        IntPredicate odd = (x)-> (x % 2 != 0);

        java.security.SecureRandom random = new java.security.SecureRandom();
        random.ints(50,1,999).filter(odd).sorted().forEach(System.out::println);
    }
}
