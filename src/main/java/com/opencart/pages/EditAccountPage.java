package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditAccountPage extends BasePage {

    @FindBy(xpath = ".//*[@class='list-group-item'][2]")
    private WebElement editAccountButton;

    public WebElement getEditAccountButton() {
        return editAccountButton;
    }

}
