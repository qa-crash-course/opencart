package com.opencart.datamodel;

public class AddToShoppingCartModel {
    private String textInput;
    private String textAreaInput;

    AddToShoppingCartModel() {
    }

    public static AddToShoppingCartModel.Builder getBuilder() {
        return new AddToShoppingCartModel().new Builder();
    }

    public class Builder {
        public AddToShoppingCartModel.Builder textInput(String value) {
            textInput = value;
            return this;
        }

        public AddToShoppingCartModel.Builder textAreaInput(String value) {
            textAreaInput = value;
            return this;
        }

        public AddToShoppingCartModel build() {
            return AddToShoppingCartModel.this;
        }
    }

    public String getTextAreaInput() {
        return textAreaInput;
    }

    public String getTextInput() {
        return textInput;
    }
}
