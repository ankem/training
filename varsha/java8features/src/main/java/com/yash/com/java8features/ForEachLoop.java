package com.yash.com.java8features;

import java.util.ArrayList;  
import java.util.List;  
public class ForEachLoop {  
    public static void main(String[] args) {  
        List<String> gamesList = new ArrayList<String>();  
        gamesList.add("Football");  
        gamesList.add("Cricket");  
        gamesList.add("Chess");  
        gamesList.add("Hocky");  
        gamesList.forEach(System.out::println);  
          
    }  
} 