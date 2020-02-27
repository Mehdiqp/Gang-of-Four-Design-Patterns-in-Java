package com.company.creational.builder;

import java.util.Date;

public class Test {
    public static void main(String[] args) {

        UserBuilder builder = new UserBuilder();
        User myUser = builder.username("myUsername").firstName("myName").lastName("myLastName").age(22).brithDate(new Date()).build();
        System.out.println(myUser);

    }
}
