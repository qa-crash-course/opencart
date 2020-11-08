package com.opencart.datamodel;

import lombok.Builder;
import lombok.Getter;

@Getter
public class RegisterModel {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
    private String password;
    private String passwordConfirm;

    RegisterModel() {
    }

    public static RegisterModel.Builder getBuilder() {
        return new RegisterModel().new Builder();
    }

    public class Builder {
        public RegisterModel.Builder firstName(String value) {
            firstName = value;
            return this;
        }

        public RegisterModel.Builder lastName(String value) {
            lastName = value;
            return this;
        }

        public RegisterModel.Builder email(String value) {
            email = value;
            return this;
        }

        public RegisterModel.Builder telephone(String value) {
            telephone = value;
            return this;
        }

        public RegisterModel.Builder password(String value) {
            password = value;
            return this;
        }

        public RegisterModel.Builder passwordConfirm(String value) {
            passwordConfirm = value;
            return this;
        }

        public RegisterModel build() {
            return RegisterModel.this;
        }
    }
}
