package com.opencart.datamodel;

import lombok.Getter;

@Getter
public class EditAccountModel {

    private String firstName;
    private String lastName;
    private String email;
    private String telephone;

    EditAccountModel(){
    }

    public static EditAccountModel.Builder getBuilder(){
        return new EditAccountModel().new Builder();
    }

    public class Builder{
        public EditAccountModel.Builder firstName(String value){
            firstName = value;
            return this;
        }

        public EditAccountModel.Builder lastName(String value){
            lastName = value;
            return this;
        }

        public EditAccountModel.Builder email(String value){
            email = value;
            return this;
        }

        public EditAccountModel.Builder telephone(String value){
            telephone = value;
            return this;
        }

        public EditAccountModel build(){
            return EditAccountModel.this;
        }
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTelephone() {
        return telephone;
    }
}
