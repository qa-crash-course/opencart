package com.opencart.datamodel;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class LoginAdminModel {

    private String adminUserName;
    private String adminPassword;
}


