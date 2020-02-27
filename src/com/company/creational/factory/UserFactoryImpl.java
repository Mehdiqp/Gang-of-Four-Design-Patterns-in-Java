package com.company.creational.factory;

import com.company.creational.factory.exception.UserFactoryException;
import com.company.creational.factory.model.Boy;
import com.company.creational.factory.model.Girl;
import com.company.creational.factory.model.Other;
import com.company.creational.factory.model.User;

public class UserFactoryImpl implements UserFactory {
    @Override
    public User createUser(UserType userType) throws Exception {
        if (userType != null) {
            switch (userType) {
                case OTHER:
                    return new Other(1L, "ali", "alavli", "dordor");
                case BOY:
                    return new Boy(2L, "hassan", "hasani", "bashgah");
                case GIRL:
                    return new Girl(3L, "jeyran", "turki", "arayeshgah");
                default:
                    throw new UserFactoryException("Unexpected value: " + userType);
            }
        }
        return null;
    }
}
