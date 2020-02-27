package com.company.creational.singelton;

public class DBConnectionSingelton {

    private static DBConnectionSingelton dbConnectionSingelton = null;

    private DBConnectionSingelton() {
    }

    public static DBConnectionSingelton getInstance() {
        if (dbConnectionSingelton == null) {
            synchronized (DBConnectionSingelton.class) {
                if (dbConnectionSingelton == null) {
                    dbConnectionSingelton = new DBConnectionSingelton();
                }
            }
        }
        return dbConnectionSingelton;
    }
}
