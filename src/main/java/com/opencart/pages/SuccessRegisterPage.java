package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessRegisterPage extends BasePage {
    @FindBy(xpath = (".//*[@id='content]/h1"))
    private WebElement succesTitle;

    public WebElement getSuccesTitle() {
        return succesTitle;
    }
}
