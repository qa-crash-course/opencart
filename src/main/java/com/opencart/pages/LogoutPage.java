package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LogoutPage  extends BasePage{
    //кнопка логаут зправа знизу
    @FindBy(xpath = ".//*[contains(@href,'Logout')]" )
    private WebElement logoutButton;

    public WebElement getLogoutButton(){
        return logoutButton;
    }
}

