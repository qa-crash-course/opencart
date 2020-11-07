package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(xpath = ".//*input[@name ='firstname']")
    private WebElement firstNameInput;
    @FindBy(xpath = ".//*input[@name ='lastname']")
    private WebElement lastNameInput;
    @FindBy(xpath = ".//*input[@name ='email']")
    private WebElement emailInput;
    @FindBy(xpath = ".//*input[@name ='telephone']")
    private WebElement telephoneInput;
    @FindBy(xpath = ".//*input[@name ='password']")
    private WebElement passwordInput;
    @FindBy(xpath = ".//*input[@name ='confirm']")
    private WebElement confirmPasswordInput;
    @FindBy(xpath = ".//*input[@name ='agree']")
    private WebElement policy;
    @FindBy(xpath = ".//*input[@type ='submit' and @value = 'Continue']")
    private WebElement continueButton;

    public WebElement getSubscribeRadioButton(int value) {
        return driver.findElement(
                By.xpath(".//*[@type = 'radio' and @value = '" + value + "']"));
    }

    public WebElement getFirstNameInput() {
        return firstNameInput;
    }

    public WebElement getLastNameInput() {
        return lastNameInput;
    }

    public WebElement getEmailInput() {
        return emailInput;
    }

    public WebElement getTelephoneInput() {
        return telephoneInput;
    }

    public WebElement getPasswordInput() {
        return passwordInput;
    }

    public WebElement getConfirmPasswordInput() {
        return confirmPasswordInput;
    }

    public WebElement getPolicy() {
        return policy;
    }

    public WebElement getContinueButton() {
        return continueButton;
    }
}

