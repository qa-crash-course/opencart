package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessLoginPage extends BasePage {
    @FindBy(xpath = ".//*[@id = 'content']/h2")
    private WebElement successLoginTitle;

    public WebElement getSuccessLoginTitle() {
        return successLoginTitle;
    }
}