package com.company.structural.adapter;

import com.company.structural.adapter.model.User;
import com.company.structural.adapter.model.UserDTO;
import com.company.structural.adapter.model.UserDTOAdapter;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        UserDTO userDTO = new UserDTO(1L, "fullname", "username", new Date());

        //hamontor ke mibini ba estefade az UserDTOAdapter ye Object UserDTO ro adapt kardim be Object User
        //inhert inja moheme deghat beshe
        User user = new UserDTOAdapter(userDTO);

        //hala sout migirim bebin
        System.out.println(user);

    }
}
