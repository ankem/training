package com.yash.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LastNameMatch1 {

    public static void main(String args[]) {
        List<Person> persons = getLastName();
        System.out.println(persons);
    }

    public static List<Person> getLastName() {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1, "Mahesh", "ramesh"));
        list.add(new Person(1, "Ganesh", "Jones"));
        list.add(new Person(1, "Mahesh", "Jones"));
        list.add(new Person(1, "ravi", "ravula"));

        return list.stream()
                .filter(emp -> emp.getLastName() == "Jones")
                .collect(Collectors.toList());
    }
}
