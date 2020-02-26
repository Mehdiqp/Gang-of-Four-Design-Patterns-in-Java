package com.company.factory;

import com.company.factory.model.User;

public interface UserFactory {

    User createUser(UserType userType) throws Exception;

    enum UserType {
        OTHER, GIRL, BOY;
    }
}
