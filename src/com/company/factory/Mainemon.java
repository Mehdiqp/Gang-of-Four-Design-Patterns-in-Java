package com.company.factory;

import com.company.factory.model.Boy;
import com.company.factory.model.Other;
import com.company.factory.model.User;

public class Mainemon {
    public static void main(String[] args) throws Exception {
        UserFactoryImpl userFactory = new UserFactoryImpl();
        Boy boyemon = (Boy) userFactory.createUser(UserFactory.UserType.BOY);
        Other other = (Other) userFactory.createUser(UserFactory.UserType.OTHER);
        System.out.println(other);
        System.out.println(boyemon);
    }
}
