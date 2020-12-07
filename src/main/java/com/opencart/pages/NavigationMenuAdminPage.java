package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NavigationMenuAdminPage extends BasePage{

    @FindBy(xpath = ".//*[contains(@href , '#collapse7')]")
    private WebElement systemButton;

    @FindBy(xpath = ".//*[contains(@href,'#collapse7-2')]")
    private WebElement localisationButton;

    @FindBy(xpath = ".//*[contains(@href,'currency')]")
    private WebElement currenciesButton;

    public WebElement getSystemButton() {
        wait.until(ExpectedConditions.elementToBeClickable(systemButton));
        return systemButton;
    }

    public WebElement getLocalisationButton() {
        wait.until(ExpectedConditions.elementToBeClickable(localisationButton));
        return localisationButton;
    }

    public WebElement getCurrenciesButton() {
        wait.until(ExpectedConditions.elementToBeClickable(currenciesButton));
        return currenciesButton;
    }
}