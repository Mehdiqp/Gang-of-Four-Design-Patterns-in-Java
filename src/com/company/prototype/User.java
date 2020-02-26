package com.company.prototype;


import java.util.Date;

public class User implements Cloneable {
    private String username;
    private String firstName;
    private String lastName;
    private Date birthDate;
    private Role role;

    public User(String username, String firstName, String lastName, Date birthDate, Role role) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
    }

    //kar rahat kon
    public static UserBuilder getUserBuilder() {
        return new UserBuilder();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
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

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    //override kardan clone jori ke mikhaym
    @Override
    public User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    //inner class vase compact kardan design :\
    //az builder estefade kardam vase kar rahati
    public static class UserBuilder {
        private String username;
        private String firstName;
        private String lastName;
        private Date birthDate;
        private Role role;

        public UserBuilder setUsername(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public UserBuilder setRole(Role role) {
            this.role = role;
            return this;
        }

        public User createUser() {
            return new User(username, firstName, lastName, birthDate, role);
        }
    }
}
