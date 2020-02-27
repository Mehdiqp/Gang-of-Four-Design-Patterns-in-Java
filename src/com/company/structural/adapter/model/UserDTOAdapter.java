package com.company.structural.adapter.model;

import java.util.Date;

//dar asl mikhaim ye adapter vase user va userdto besazim
public class UserDTOAdapter extends User {

    private UserDTO userDTO;

//garanti mikonim ke harvaght az in instance sakhte shod hatman ye UserDTO az karbar begirim
    //chon mikha
    public UserDTOAdapter(UserDTO userDTO) {
        this.userDTO = userDTO;
        System.out.println("----------------------");
        System.out.println(userDTO);
        System.out.println("----------------------");
    }



    @Override
    public Long getId() {
        //2ta field ro be ham adapte mikonim estelahan
        return userDTO.getUsercode();
    }

    @Override
    public String getFirsName() {
        //hala masalan fk mikonim ke ina bayad be ham adapte beshan
        //shomam to zendeghi haminjori fk konid
        //yani to iran ke crona dare behemon fro mishe bayad haminjori easy bud
        return userDTO.getFullName();
    }

    @Override
    public String getUsername() {
        return userDTO.getUsername();
    }

    @Override
    public String getLastName() {
        return userDTO.getFullName();
    }

    @Override
    public Date getBirthDate() {
        return userDTO.getBirthDate();
    }


    //ino hatman override konid
    @Override
    public String toString() {
        return "User{" +
                "id=" + getId() +
                ", username='" + getUsername() + '\'' +
                ", firsName='" + getFirsName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", birthDate=" + getBirthDate() +
                '}';
    }
}
