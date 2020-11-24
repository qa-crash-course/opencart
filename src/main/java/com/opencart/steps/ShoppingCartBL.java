package com.opencart.steps;

import com.opencart.pages.SuccessShoppingCartPage;
import org.testng.Assert;

import static com.opencart.enums.ShoppingCartVerifyProductByName.MacBook;

public class ShoppingCartBL {
    private SuccessShoppingCartPage successShoppingCartPage;

    public ShoppingCartBL verifyShoppingCartInformation() {
        successShoppingCartPage = new SuccessShoppingCartPage();
        String expected = MacBook.getValue();
        String actual = successShoppingCartPage.getSuccesTitle().getText();
        Assert.assertEquals(actual, expected);
        return this;
    }

    public ShoppingCartBL clickOnRemoveButton() {
        successShoppingCartPage.getRemoveButton().click();
        return this;
    }

    public ShoppingCartBL verifyRemoveButton() {
        successShoppingCartPage.getRemoveTitle();
        return this;
    }
}
