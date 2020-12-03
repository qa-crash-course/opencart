package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessAddNewCurrency extends BasePage {
    @FindBy(css = ".alert")
    private WebElement successAddNewCurrency;

    public WebElement getSuccessAddNewCurrency() {
        return successAddNewCurrency;
    }
}