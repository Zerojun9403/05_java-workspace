package edu.practice.day9.model;

public class Employee {
    private  String id;
    private String name;
    private String department;
    private int salary; // 단위: 만원
    Employee(String id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }


}
