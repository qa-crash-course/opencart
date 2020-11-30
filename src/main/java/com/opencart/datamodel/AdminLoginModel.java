package com.opencart.datamodel;

import lombok.Builder;

@Builder
public class AdminLoginModel {
    private String adminUserName;
    private String adminPassword;


    public String getAdminUserName() {
        return adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }
}
