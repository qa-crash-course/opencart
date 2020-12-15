package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminLoginPage extends  BasePage {

    @FindBy(id = "input-username")
    private WebElement inputAdminUserName;

    @FindBy(id = "input-password")
    private WebElement inputAdminPassword;

    @FindBy(xpath = ".//*[@type = 'submit']")
    private WebElement adminLoginButton;

    public WebElement getInputAdminUserName() {
        return inputAdminUserName;
    }

    public WebElement getInputAdminPassword() {
        return inputAdminPassword;
    }

    public WebElement getAdminLoginButton() {
        return adminLoginButton;
    }
}
