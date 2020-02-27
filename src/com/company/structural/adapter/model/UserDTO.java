package com.company.structural.adapter.model;

import java.util.Date;

public class UserDTO {
    private Long usercode;
    private String fullName;
    private String username;
    private Date birthDate;

    public UserDTO(Long usercode, String fullName, String username, Date birthDate) {
        this.usercode = usercode;
        this.fullName = fullName;
        this.username = username;
        this.birthDate = birthDate;
    }

    public UserDTO() {
    }

    public Long getUsercode() {
        return usercode;
    }

    public void setUsercode(Long usercode) {
        this.usercode = usercode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "usercode=" + usercode +
                ", fullName='" + fullName + '\'' +
                ", username='" + username + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
