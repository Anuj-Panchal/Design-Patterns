package com.anuj.structural.composite;

public class Developer implements Employee {
    private String name;

    private Integer empId;

    public Developer(String name, Integer empId) {
        this.name = name;
        this.empId = empId;
    }

    @Override
    public void showEmployeeDetails() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", empId=" + empId +
                '}';
    }
}
