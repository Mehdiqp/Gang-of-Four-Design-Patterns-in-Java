package com.company.prototype;

import java.util.Date;


//in design vase time hast ke ma nemikhaym dobare new konim vase create kardan ye object
//because sometimes it's expense
public class Main {
    public static void main(String[] args) {
        User user = User.getUserBuilder()
                .setFirstName("name")
                .setLastName("lastName")
                .setUsername("username")
                .setBirthDate(new Date())
                .setRole(new Role())
                .createUser();

        //their have uniq hash
        //but role hash not uniq!!!
        //this mean shallow clone :/
        //vase deep clone ma hatman bayad super.clone() ro khodemon dobare benevisim ba algoritm jadid
        System.out.println(user.hashCode());
        User clone = user.clone();
        System.out.println(clone.hashCode());


    }
}
