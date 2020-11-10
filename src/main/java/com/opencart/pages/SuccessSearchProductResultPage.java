package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Class that is useful in SearchProductTest
 */

public class SuccessSearchProductResultPage extends BasePage {
    @FindBy(xpath = ".//div/h2")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }
}
