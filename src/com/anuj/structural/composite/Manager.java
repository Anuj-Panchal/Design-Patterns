package com.anuj.structural.composite;

public class Manager implements Employee{

    private String name;

    private Integer empId;

    public Manager(String name, Integer empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}
