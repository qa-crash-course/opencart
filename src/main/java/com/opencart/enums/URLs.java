package com.opencart.enums;

public enum URLs {
    //BASE_URL("http://localhost/upload/"),
    BASE_URL("http://localhost/opencart/upload/"),
    ACCOUNT_URL("http://localhost/opencart/upload/index.php?route=account/account"),

    ADMIN_URL("http://localhost/upload/admin");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
