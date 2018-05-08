package com.yash.com;
import java.util.*;  
import java.util.stream.Collectors;  
class Employee{  
    int id;  
    String name;  
    float salary;  
    public Employee(int id, String name, float salary) {  
        this.id = id;  
        this.name = name;  
        this.salary = salary;  
    }  
}  

public class Stream {
	 public static void main(String[] args) {  
	        List<Employee> em = new ArrayList<Employee>();  
	        //Adding Products  
	        em.add(new Employee(1,"Lakshma",45000f));  
	        em.add(new Employee(2,"san",50000f));  
	        em.add(new Employee(3,"vamsy",50000f));  
	        em.add(new Employee(4,"Srinu",55000f));  
	        em.add(new Employee(5,"kiran",60000f));  
	        List<Float> employeeSalary = em.stream()  
	                                     .filter(p -> p.salary > 30000)// filtering data  
	                                     .map(p->p.salary)        // fetching price  
	                                     .collect(Collectors.toList()); // collecting as list  
	        System.out.println(employeeSalary);  
	    }  
}
