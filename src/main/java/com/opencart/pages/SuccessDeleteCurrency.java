package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessDeleteCurrency extends BasePage {
    @FindBy(css = ".alert")
    private WebElement successDeleteCurrency;

    public WebElement getSuccessDeleteCurrency() {
        return successDeleteCurrency;
    }
}
