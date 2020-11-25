package com.opencart.steps;

import com.opencart.pages.AddToShoppingCartPage;
import org.openqa.selenium.WebElement;

public class AddToShoppingCartBL {
    private AddToShoppingCartPage addToShoppingCartPage;

    public AddToShoppingCartBL() {
        addToShoppingCartPage = new AddToShoppingCartPage();
    }

    public AddToShoppingCartBL clickOnAddToShoppingCartButton() {
        addToShoppingCartPage.getAddToShoppingCartButton().get(0).click();
        return this;
    }

    public ShoppingCartBL clickOnShoppingCartButton() {
        addToShoppingCartPage.getShoppingCartButton().click();
        return new ShoppingCartBL();
    }
}
