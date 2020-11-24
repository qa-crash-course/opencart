package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessEditPage extends BasePage {
    @FindBy(xpath = ".//*[@class='alert alert-success alert-dismissible']")
    private WebElement successEditTitle;

    public WebElement getSuccessEditTitle() {
        return successEditTitle;
    }
}
