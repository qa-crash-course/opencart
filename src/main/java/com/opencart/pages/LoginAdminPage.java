package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class LoginAdminPage extends BasePage {

    @FindBy(id = "input-username")
    private WebElement adminUserName;

    @FindBy(id = "input-password")
    private WebElement adminPassword;

    @FindBy(xpath = ".//*[@type = 'submit']")
    private WebElement adminLoginButton;

    public WebElement getAdminUserName() {
        return adminUserName;
    }

    public WebElement getAdminPassword() {
        return adminPassword;
    }

    public WebElement getAdminLoginButton() {
        return adminLoginButton;
    }
}
