package com.opencart.repository;

import com.opencart.datamodel.LoginAdminModel;
import lombok.SneakyThrows;

import java.io.FileInputStream;
import java.util.Properties;

public class AdminLoginRepository {

    private AdminLoginRepository() {
    }

    @SneakyThrows
    public static LoginAdminModel getAdminPanelModel() {
        final Properties properties = new Properties();
        properties.load(new FileInputStream("src/main/sources/application.properties"));
        String adminUser = properties.getProperty("adminusername ");
        String adminPassword = properties.getProperty("adminpassword");

        return LoginAdminModel.builder()
                .adminUserName(adminUser)
                .adminPassword(adminPassword)
                .build();


    }


}
