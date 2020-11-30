package com.opencart.enums;

public enum ShoppingCartVerification {
    MacBook("MacBook"), AppleCinema("Apple Cinema 30\""), NumberOfProducts("4");

    private final String value;

    ShoppingCartVerification(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
