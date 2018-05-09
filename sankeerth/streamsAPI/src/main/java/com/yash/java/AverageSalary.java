package com.yash.java;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AverageSalary {
    public static void main(String[] args){
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, 2000, "accounting"));
        list.add(new Employee(2, 3000, "manufacturing"));
        list.add(new Employee(3, 2000, "accounting"));
        list.add(new Employee(4, 2000, "accounting"));
        list.add(new Employee(5, 3000, "manufacturing"));
        list.add(new Employee(6, 2000, "manufacturing"));
        list.add(new Employee(7, 2000, "manufacturing"));

//        list.forEach(employee -> System.out.println(employee.getId()+","+employee.getSalary()+","+employee.getDepartment()));

        OptionalDouble average = list.stream().filter(e->e.getDepartment()=="manufacturing").mapToInt(e->e.getSalary()).average();

//        String average = list.stream().mapToInt(e->e.getSalary()).average().toString();
        System.out.print(average);
    }
}
