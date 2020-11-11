package com.opencart.enums;

public enum SearchPhrases {

    MAC("Mac"), SONY("Nikon");

    private final String value;

    SearchPhrases(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
