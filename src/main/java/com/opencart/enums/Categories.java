package com.opencart.enums;

public enum Categories {
    DESKTOPS("Desktops"), COMPONENTS("Components");
    private final String value;

    Categories (String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
