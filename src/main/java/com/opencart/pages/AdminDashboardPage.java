package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboardPage extends BasePage {
    @FindBy(xpath = ".//div/h1")
    private WebElement successAdminLoginTitle;
    public WebElement getSuccessAdminLoginTitle() {
        return successAdminLoginTitle;
    }
}
