package com.company.structural.composite;


public class Developer implements Employee {


    private String name;
    private String position;
    private long empId;

    public Developer(String name, String position, long empId) {
        this.name = name;
        this.position = position;
        this.empId = empId;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " " + position + " " + empId);
    }
}
