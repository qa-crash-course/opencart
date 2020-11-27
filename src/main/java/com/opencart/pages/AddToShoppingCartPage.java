package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AddToShoppingCartPage extends BasePage {
    @FindBy(xpath = ".//*[@id='input-option218']//*[@value='5']")
    private WebElement radioButton;

    @FindBy(xpath = ".//*[@id='input-option223']//*[@value='9']")
    private WebElement checkboxButton;

    @FindBy(xpath = ".//div[@class='form-group required ']//*[@type='text']")
    private WebElement textInputButton;

    @FindBy(xpath = ".//div[@class='form-group required ']//*[@name='option[217]']")
    private WebElement sliderButton1;

    @FindBy(xpath = ".//div[@class='form-group required ']//*[@value='4']")
    private WebElement sliderButton2;

    @FindBy(xpath = ".//div[@class='form-group required ']//*[@name='option[209]']")
    private WebElement textAreaInputButton;

    @FindBy(xpath = ".//*[@name='option[222]']")
    private WebElement uploadFileButton;

    @FindBy(xpath = ".//*[@id='button-cart']")
    private WebElement addToCartButton;

    @FindBy(xpath = ".//*[@class='alert alert-success alert-dismissible']")
    private WebElement successAddToTitle;

    @FindBy(xpath = ".//*[@title='Shopping Cart']")
    private WebElement goToShoppingCartStore;


    public WebElement getCheckboxButton() {
        return checkboxButton;
    }

    public WebElement getRadioButton() {
        return radioButton;
    }

    public WebElement getSliderButton1() {
        return sliderButton1;
    }

    public WebElement getSliderButton2() {
        return sliderButton2;
    }

    public WebElement getTextInputButton() {
        wait.until(ExpectedConditions.elementToBeClickable(textInputButton));
        return textInputButton;
    }

    public WebElement getTextAreaInputButton() {
        return textAreaInputButton;
    }

    public WebElement getUploadFileButton() {
        return uploadFileButton;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public WebElement successAddToTitle() {
        wait.until(ExpectedConditions.elementToBeClickable(successAddToTitle));
        return successAddToTitle;
    }

    public WebElement getGoToShoppingCartStore() {
        wait.until(ExpectedConditions.elementToBeClickable(goToShoppingCartStore));
        return goToShoppingCartStore;
    }
}
