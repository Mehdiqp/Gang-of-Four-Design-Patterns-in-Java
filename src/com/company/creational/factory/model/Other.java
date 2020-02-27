package com.company.creational.factory.model;

public class Other extends User {
    private String otherInteresting;

    public Other(Long id, String name, String lastName, String otherInteresting) {
        super(id, name, lastName);
        this.otherInteresting = otherInteresting;
    }

    public String getOtherInteresting() {
        return otherInteresting;
    }

    public void setOtherInteresting(String otherInteresting) {
        this.otherInteresting = otherInteresting;
    }

    @Override
    public String toString() {
        return "Other{" + super.toString() +
                "otherInteresting='" + otherInteresting + '\'' +
                '}';
    }
}
