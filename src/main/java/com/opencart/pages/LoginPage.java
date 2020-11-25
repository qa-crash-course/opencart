package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.opencart.pages.HeaderPage;

public class LoginPage extends BasePage {

    @FindBy(id = "input-email")
    private WebElement emailInput;

    @FindBy(id = "input-password")
    private WebElement passwordInput;

    @FindBy(xpath = ".//*[@type ='submit']")
    private WebElement loginButton;

    public WebElement getEmailInput() {
        return emailInput;
    }
    public WebElement getPasswordInput() {
        return passwordInput;
    }
    public WebElement getLoginButton(){
        return loginButton;
    }
}