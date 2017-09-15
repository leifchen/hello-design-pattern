package com.chen.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Desc: 员工信息
 * @Author: LeifChen
 * @Date: 2017-09-15
 */
public class Employee {

    private String name;

    private String dept;

    private double salary;

    private List<Employee> subordinates;

    public Employee(String name, String dept, double salary) {
        this.name = name;
        this.dept = dept;
        this.salary = salary;
        subordinates = new ArrayList<>();
    }

    public void add(Employee e) {
        subordinates.add(e);
    }

    public void remove(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates() {
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + '\'' + ", dept='" + dept + '\'' + ", salary=" + salary + '}';
    }

}
