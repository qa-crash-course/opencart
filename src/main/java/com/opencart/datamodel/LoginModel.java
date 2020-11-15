package com.opencart.datamodel;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LoginModel {
    private String email;
    private String password;


}
