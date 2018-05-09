package com.yash.java;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Random30Letters {
    public static void main(String args[])
    {
        List<Character> randomCharacters = new ArrayList<>();

        //generating 30 random letters
        for(int i = 0; i<30; i++){
            int num = (int) (26* Math.random());
            char letter = (char) (num + 'a');
            randomCharacters.add(letter);
        }
        List result = randomCharacters.stream().sorted().collect(Collectors.toList());
        System.out.println("Ascending order");
        System.out.println(result);

        List result1 = randomCharacters.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Descending  order");
        System.out.println(result1);

        List result2 = randomCharacters.stream().sorted().distinct().collect(Collectors.toList());
        System.out.println("Without duplicates");
        System.out.println(result2);
    }
}
