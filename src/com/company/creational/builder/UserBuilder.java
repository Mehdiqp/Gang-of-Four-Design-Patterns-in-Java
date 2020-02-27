package com.company.creational.builder;

import java.util.Date;

class UserBuilder {

    private String username;
    private String firstName;
    private String lastName;
    private int age;
    private Date brithDate;

    public UserBuilder username(String username) {
        this.username = username;
        return this;
    }

    public UserBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder age(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder brithDate(Date brithDate) {
        this.brithDate = brithDate;
        return this;
    }

    public User build() {
        User user = new User();
        user.setUsername(username);
        user.setLastName(lastName);
        user.setAge(age);
        user.setBrithDate(brithDate);
        user.setFirstName(firstName);
        return user;
    }
}