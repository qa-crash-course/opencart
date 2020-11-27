package com.opencart.enums;

public enum ShoppingCartVerifyProductByName {
    MacBook("MacBook"), AppleCinema("Apple Cinema 30\"");

    private final String value;

    ShoppingCartVerifyProductByName(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
