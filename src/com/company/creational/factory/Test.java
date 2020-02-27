package com.company.creational.factory;

import com.company.creational.factory.model.Boy;
import com.company.creational.factory.model.Other;

public class Test {
    public static void main(String[] args) throws Exception {
        UserFactoryImpl userFactory = new UserFactoryImpl();
        Boy boyemon = (Boy) userFactory.createUser(UserFactory.UserType.BOY);
        Other other = (Other) userFactory.createUser(UserFactory.UserType.OTHER);
        System.out.println(other);
        System.out.println(boyemon);
    }
}
