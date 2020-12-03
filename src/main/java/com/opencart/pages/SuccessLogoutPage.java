package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessLogoutPage extends BasePage {
    @FindBy(xpath = ".//*[@id = 'content']/h1")
    private WebElement successLogoutTitle;

    public WebElement getSuccessLogoutTitle() {
        return successLogoutTitle;
    }
}