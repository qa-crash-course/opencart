package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessAddNewCurrency extends BasePage {
    @FindBy(className = ".alert alert-success alert-dismissible")
    private WebElement successAddNewCurrency;

    public WebElement getSuccessAddNewCurrency() {
        return successAddNewCurrency;
    }
}
