package com.yash.java;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AverageSalary {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(1, 2000, "accounting"));
        list.add(new Employee(2, 3000, "manufacturing"));
        list.add(new Employee(3, 2000, "accounting"));
        list.add(new Employee(4, 2000, "accounting"));
        list.add(new Employee(5, 3000, "manufacturing"));
        list.add(new Employee(6, 2000, "manufacturing"));
        list.add(new Employee(7, 2000, "manufacturing"));

//        list.forEach(employee -> System.out.println(employee.getId()+","+employee.getSalary()+","+employee.getDepartment()));

        list.stream().forEach(e -> e.getDepartment());

        OptionalDouble average = list.stream().filter(e -> e.getDepartment() == "manufacturing").mapToInt(e -> e.getSalary()).average();

//        String average = list.stream().mapToInt(e->e.getSalary()).average().toString();
//        System.out.print(average);
        List<String> departemnts = list.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.toList());
        departemnts.forEach(dep -> {
                    List<Integer> salaries = list.stream()
                            .filter(e -> e.getDepartment().equals(dep))
                            .map(e -> e.getSalary())
                            .collect(Collectors.toList());

                    int[] salariesAsInt = new int[salaries.size()];
                    for (int i = 0; i < salaries.size(); i++) {
                        salariesAsInt[i] = salaries.get(i);
                    }
                    OptionalDouble avg = IntStream.of(salariesAsInt).average();

                    System.out.println("dep = " + dep);
                    System.out.println("avg = " + avg);
                    ;
                }
        );

    }
}

class A extends B{
    public Integer abc()throws IOException {
        return 2;
    }
}
class B {
 public Object abc() throws Exception{
     System.out.println();
     return "1";
 }
}