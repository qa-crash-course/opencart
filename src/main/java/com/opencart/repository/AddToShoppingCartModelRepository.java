package com.opencart.repository;

import com.opencart.datamodel.AddToShoppingCartModel;
import org.apache.commons.lang3.RandomStringUtils;

public class AddToShoppingCartModelRepository {
    private AddToShoppingCartModelRepository() {
    }

    public static AddToShoppingCartModel getAddToShoppingCartModel() {
        return AddToShoppingCartModel.getBuilder()
                .textInput(RandomStringUtils.randomAlphabetic(10))
                .textAreaInput(RandomStringUtils.randomAlphabetic(10))
                .build();
    }
}
