package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationMenuAdminPage extends BasePage{

    @FindBy(xpath = ".//*[contains(@href , '#collapse7')]")
    private WebElement systemButton;

    @FindBy(xpath = ".//*[contains(@href , '#collapse7-2')]")
    private WebElement localizationButton;

    @FindBy(xpath = ".//*[contains(@href , 'http://localhost/opencart/upload/admin/index.php?route=localisation/currency&user_token=AG2XbPvlJfbHIeiYJAFVx0llKsGXueRi\n')]")
    private WebElement currenciesButton;

    @FindBy(css = "*.fa-plus")
    private WebElement addNewCurrenciesButton;

    public WebElement getSystemButton() {
        return systemButton;
    }

    public WebElement getLocalizationButton() {
        return localizationButton;
    }

    public WebElement getCurrenciesButton() {
        return currenciesButton;
    }

    public WebElement getAddNewCurrenciesButton() {
        return addNewCurrenciesButton;
    }
}
