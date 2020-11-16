package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HeaderPage extends BasePage {

    @FindBy(xpath = ".//*[@title = 'My Account']")
    private WebElement myAccountButton;
    @FindBy(xpath = ".//*[contains(@href,'register')]")
    private WebElement registerButton;
    @FindBy(xpath = ".//*[contains(@href,'login')]" )
    private WebElement loginButton;

    public WebElement getMyAccountButton() {
        wait.until(ExpectedConditions.visibilityOf(myAccountButton));
        return myAccountButton;
    }
    public WebElement getRegisterButton() {
        return registerButton;
    }
    public WebElement getLoginButton(){
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        return loginButton;
    }
}
