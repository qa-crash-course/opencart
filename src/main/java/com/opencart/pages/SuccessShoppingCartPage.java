package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessShoppingCartPage extends BasePage {
    @FindBy(xpath = ".//*[@id='checkout-cart']//*[@method='post']//td[@class='text-left']/a")
    private WebElement succesTitle;

    @FindBy(xpath = ".//*[@id='checkout-cart']//*[@class='btn btn-danger']")
    private WebElement removeButton;

    @FindBy(xpath = ".//div[@id='content']/p")
    private WebElement removeTitle;

    @FindBy(xpath = ".//div[@class='input-group btn-block']//input")
    private WebElement textInputOnUpdateButton;

    @FindBy(xpath = ".//div[@class='input-group btn-block']//*[@type='submit']")
    private WebElement clickOnUpdateButton;

    @FindBy(xpath = ".//*[@class='table-responsive']//tbody//*[@class='text-right'][2]")
    private WebElement verifyUpdateButtonTotalPriceField;

    public WebElement getSuccesTitle() {
        return succesTitle;
    }

    public WebElement getRemoveButton() {
        return removeButton;
    }

    public WebElement getRemoveTitle() {
        wait.until(ExpectedConditions.textToBe(By.xpath(".//div[@id='content']/p"), "Your shopping cart is empty!"));
        return removeTitle;
    }

    public WebElement getTextInputOnUpdateButton() {
        return textInputOnUpdateButton;
    }

    public WebElement getClickOnUpdateButton() {
        return clickOnUpdateButton;
    }

    public WebElement getVerifyUpdateButtonTotalPriceField() {
        return verifyUpdateButtonTotalPriceField;
    }
}
