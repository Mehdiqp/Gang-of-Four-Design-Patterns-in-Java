package com.company.creational.factory.exception;

public class UserFactoryException extends Exception {
    public UserFactoryException() {
        super();
    }

    public UserFactoryException(String message) {
        super(message);
    }

    public UserFactoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserFactoryException(Throwable cause) {
        super(cause);
    }

    protected UserFactoryException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
