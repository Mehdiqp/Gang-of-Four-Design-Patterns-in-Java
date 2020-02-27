package com.company.creational.factory;

import com.company.creational.factory.model.User;

public interface UserFactory {

    User createUser(UserType userType) throws Exception;

    enum UserType {
        OTHER, GIRL, BOY;
    }
}
