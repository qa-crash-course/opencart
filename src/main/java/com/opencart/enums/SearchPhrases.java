package com.opencart.enums;

public enum SearchPhrases {

    MAC("mac"), SONY("Nikon"), DELL("xps 15");

    private final String value;

    SearchPhrases(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
