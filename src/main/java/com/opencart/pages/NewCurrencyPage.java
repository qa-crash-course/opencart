package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class NewCurrencyPage extends  BasePage{
    @FindBy(id = "input-title")
    private WebElement titleCurrencyInput;

    @FindBy(id = "input-code")
    private WebElement codeCurrencyInput;

    @FindBy(id = "input-value")
    private WebElement valueCurrencyInput;

    @FindBy(css = "*.fa-save")
    private WebElement currencySave;

    public WebElement getEnabledCurrency(int value) {
        return driver.findElement(
                By.xpath(".//*[@id = 'input-status' and @value = '" + value + "']"));
    }
    public WebElement getTitleCurrencyInput(){
        return titleCurrencyInput;
    }

    public WebElement getCodeCurrencyInput() {
        return codeCurrencyInput;
    }

    public WebElement getValueCurrencyInput() {
        return valueCurrencyInput;
    }

    public WebElement getCurrencySave() {
        return currencySave;
    }
}
