package com.company.creational.factory.model;

public class Girl extends User {
    private String girlsIntersting;

    public Girl(Long id, String name, String lastName, String girlsIntersting) {
        super(id, name, lastName);
        this.girlsIntersting = girlsIntersting;
    }

    public String getGirlsIntersting() {
        return girlsIntersting;
    }

    public void setGirlsIntersting(String girlsIntersting) {
        this.girlsIntersting = girlsIntersting;
    }
}
