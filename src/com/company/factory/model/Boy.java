package com.company.factory.model;

public class Boy extends User {
    private String boyINteresting;

    public Boy(Long id, String name, String lastName, String boyINteresting) {
        super(id, name, lastName);
        this.boyINteresting = boyINteresting;
    }

    public String getBoyINteresting() {
        return boyINteresting;
    }

    public void setBoyINteresting(String boyINteresting) {
        this.boyINteresting = boyINteresting;
    }


    @Override
    public String toString() {
        return "Boy{" +
                super.toString() +
                "boyINteresting='" + boyINteresting + '\'' +
                '}';
    }
}
