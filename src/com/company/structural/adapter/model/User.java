package com.company.structural.adapter.model;

import java.util.Date;

public class User {
    private Long id;
    private String username;
    private String firsName;
    private String lastName;
    private Date birthDate;

    public User(Long id, String username, String firsName, String lastName, Date birthDate) {
        this.id = id;
        this.username = username;
        this.firsName = firsName;
        this.lastName = lastName;
        this.birthDate = birthDate;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }


    //vase inke khoroji bedim beheton inam impl mikonim
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firsName='" + firsName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
