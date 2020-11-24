package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessShoppingCartPage extends BasePage {
    @FindBy(xpath = ".//*[@id='checkout-cart']//*[@method='post']//td[@class='text-left']/a")
    private WebElement succesTitle;

    @FindBy(xpath = ".//*[@id='checkout-cart']//*[@class='btn btn-danger']")
    private WebElement removeButton;

    @FindBy(xpath = ".//div[@id='content']/p")
    private WebElement removeTitle;

    public WebElement getSuccesTitle() {
        return succesTitle;
    }

    public WebElement getRemoveButton() {
        return removeButton;
    }

    public WebElement getRemoveTitle() {
        return removeTitle;
    }
}
