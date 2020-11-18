package com.opencart.repository;

import com.opencart.datamodel.LoginModel;
import lombok.SneakyThrows;
import lombok.Value;

import java.io.FileInputStream;
import java.lang.System;
import java.util.Properties;

public class LoginModelRepository {

    private LoginModelRepository() {

    }

    @SneakyThrows
    public static LoginModel getLoginModel() {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/sourse/aplicatin.properties"));
        String email = properties.getProperty("email");
        String password = properties.getProperty("password");

        return LoginModel.builder().email(email)
                .password(password)
                .build();
    }
}