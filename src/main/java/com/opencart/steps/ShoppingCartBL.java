package com.opencart.steps;

import com.opencart.pages.SuccessShoppingCartPage;
import org.testng.Assert;

public class ShoppingCartBL {
    private SuccessShoppingCartPage successShoppingCartPage;

    public ShoppingCartBL verifyShoppingCartInformation(String productName) {
        successShoppingCartPage = new SuccessShoppingCartPage();
        String expected = productName;
        String actual = successShoppingCartPage.getSuccesTitle().getText();
        Assert.assertEquals(actual, expected);
        return this;
    }

    public ShoppingCartBL clickOnRemoveButton() {
        successShoppingCartPage = new SuccessShoppingCartPage();
        successShoppingCartPage.getRemoveButton().click();
        return this;
    }

    public ShoppingCartBL verifyThatShoppingCartIsEmpty() {
        String expected = "Your shopping cart is empty!";
        String actual = successShoppingCartPage.getRemoveTitle().getText();
        Assert.assertEquals(actual, expected);
        return this;
    }

    public ShoppingCartBL textInputUpdateButton(String numberOfProducts) {
        successShoppingCartPage = new SuccessShoppingCartPage();
        successShoppingCartPage.getTextInputOnUpdateButton().clear();
        successShoppingCartPage.getTextInputOnUpdateButton().sendKeys(numberOfProducts);
        return this;
    }

    public ShoppingCartBL clickOnUpdateButton() {
        successShoppingCartPage.getClickOnUpdateButton().click();
        return this;
    }

    public ShoppingCartBL verifyUpdateButtonTotalPriceField() {
        String expected = "$2,408.00";
        String actual = successShoppingCartPage.getVerifyUpdateButtonTotalPriceField().getText();
        Assert.assertEquals(actual, expected);
        return this;
    }
}
