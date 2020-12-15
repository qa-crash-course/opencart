package com.opencart.repository;

import com.opencart.datamodel.AdminLoginModel;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

public class AdminLoginRepository {

    private AdminLoginRepository() {
    }

    @SneakyThrows
    public static AdminLoginModel getAdminLoginModel() {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("resources/application.properties"));
        String adminUserName = properties.getProperty("adminUserName");
        String adminPassword = properties.getProperty("adminPassword");

        return AdminLoginModel.builder()
                .adminUserName(adminUserName)
                .adminPassword(adminPassword)
                .build();
    }
}