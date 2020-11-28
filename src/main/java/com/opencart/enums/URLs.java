package com.opencart.enums;

public enum URLs {
    //BASE_URL("http://localhost/upload/"),
    BASE_URL("http://localhost/opencart/upload/"),
    //ADMIN_URL("http://localhost/upload/admin");
    ADMIN_URL("http://localhost/opencart/upload/admin/");

    private final String value;

    URLs(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
