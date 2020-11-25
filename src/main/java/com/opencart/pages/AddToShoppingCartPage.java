package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddToShoppingCartPage extends BasePage {
    @FindBy(xpath = "//div[@class='product-thumb transition']//*[@class='button-group']/*[@type='button'][1]")
    private List<WebElement> addToShoppingCartButton;

    @FindBy(xpath = ".//*[@title='Shopping Cart']")
    private WebElement ShoppingCartButton;

    public List<WebElement> getAddToShoppingCartButton() {
        return addToShoppingCartButton;
    }

    public WebElement getShoppingCartButton() {
        return ShoppingCartButton;
    }
}
