package com.yash.java;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StudentIndividualAverages {
    public static void main(String[] args) {
        int[][] array = {{10, 20, 30}, {11, 21, 31}, {12, 22, 32}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}, {10, 20, 30}};
        List<OptionalDouble> averages = Arrays.stream(array).map(t -> Arrays.stream(t).average()).collect(Collectors.toList());
        averages.forEach(System.out::println);

        System.out.println("average if 1st element"+IntStream.of(array[1]).average());
//        Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).average();
//        Arrays.stream(array).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);


    }
}
