package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditMyAccountInformationPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameEditInput;

    @FindBy(id = "input-lastname")
    private WebElement lastNameEditInput;

    @FindBy(id = "input-email")
    private WebElement emailEditInput;

    @FindBy(id = "input-telephone")
    private WebElement telephoneInput;

    @FindBy(xpath = ".//*[@type='submit']")
    private WebElement continueButton;

    public WebElement getFirstNameEditInput() {
        return firstNameEditInput;
    }

    public WebElement getLastNameEditInput() {
        return lastNameEditInput;
    }

    public WebElement getEmailEditInput() {
        return emailEditInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}
