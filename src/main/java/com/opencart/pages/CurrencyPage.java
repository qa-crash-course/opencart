package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CurrencyPage extends  BasePage{


    @FindBy(css = "*.fa-plus")
    private WebElement addNewCurrenciesButton;

    @FindBy(css = "*.fa-trash-o")
    private WebElement deleteCurrency;

    @FindBy(id = "input-title")
    private WebElement titleCurrencyInput;

    @FindBy(id = "input-code")
    private WebElement codeCurrencyInput;

    @FindBy(id = "input-value")
    private WebElement valueCurrencyInput;

    @FindBy(css = "*.fa-save")
    private WebElement currencySave;

    @FindBy(id = "input-status")
    private WebElement enableStatusNewCurrency;

    public WebElement getCurrencyCheckbox(String currencyName) {
        return driver.findElement(
                By.xpath(".//*[text()='"+ currencyName +"']/preceding-sibling::td/*[@type='checkbox']"));
    }

    public Select getEnableStatusValue() {
        return new Select(enableStatusNewCurrency);
    }


    public WebElement getTitleCurrencyInput() {
        return titleCurrencyInput;
    }

    public WebElement getCodeCurrencyInput() {
        return codeCurrencyInput;
    }

    public WebElement getValueCurrencyInput() {
        return valueCurrencyInput;
    }

    public WebElement getAddNewCurrenciesButton() {
        return addNewCurrenciesButton;
    }

    public WebElement getCurrencySave() {
        return currencySave;
    }

    public WebElement getDeleteCurrency() {
        return deleteCurrency;
    }
}
