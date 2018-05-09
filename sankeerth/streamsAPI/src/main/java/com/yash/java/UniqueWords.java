package com.yash.java;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
import java.util.stream.Collectors;


public class UniqueWords {
    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String sentence = reader.nextLine();
        reader.close();

        String[] words = sentence.split(" ");

        HashSet<String> mySet = new HashSet<>();
        for(int i=0;i<words.length;i++){
            mySet.add(words[i].toLowerCase());
        }

        List<String> slist = mySet.stream().sorted().collect(Collectors.toList());
        slist.forEach(System.out::println);
    }
}
