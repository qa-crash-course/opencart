package com.opencart.repository;

import com.opencart.datamodel.LoginModel;

public class LoginModelRepository {

    private LoginModelRepository(){

    }

    public static LoginModel getLoginModel(){
        String password = "admin";
        String email = "test@gmail.com";
        return LoginModel.builder().email(email)
                .password(password)
                .build();
    }
}
