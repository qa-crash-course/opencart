package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessEditPage extends BasePage {
    @FindBy(xpath = "//*[contains(text(),' Success: Your account has been successfully updated.')]")
    private WebElement successEditTitle;

    public WebElement getSuccessEditTitle() {
        return successEditTitle;
    }
}
