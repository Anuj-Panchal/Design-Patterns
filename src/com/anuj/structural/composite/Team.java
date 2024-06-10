package com.anuj.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Employee{

    private List<Employee> employees;

    public Team() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void showEmployeeDetails() {
        employees.forEach(System.out::println);
    }

    @Override
    public String toString() {
        return "Team{" +
                "employees=" + employees +
                '}';
    }
}
