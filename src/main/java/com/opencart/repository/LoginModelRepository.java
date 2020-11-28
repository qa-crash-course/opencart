package com.opencart.repository;

import com.opencart.datamodel.LoginModel;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

public class LoginModelRepository {

    private LoginModelRepository() {
    }

    @SneakyThrows
    public static LoginModel getLoginModel() {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/sources/application.properties"));
        String email = properties.getProperty("email");
        String password = properties.getProperty("password");

        return LoginModel.builder().email(email)
                .password(password)
                .build();
    }
}