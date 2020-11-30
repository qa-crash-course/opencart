package com.opencart.steps;

import com.opencart.datamodel.CurrencyModel;
import com.opencart.pages.CurrencyPage;
import com.opencart.pages.SuccessAddNewCurrency;
import com.opencart.repository.CurrencyModelRepository;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

public class CurrencyPageBL {

    private CurrencyPage  currencyPage;
    private SuccessAddNewCurrency successAddNewCurrency;

    public CurrencyPageBL (){
        currencyPage = new CurrencyPage();
    }

    public CurrencyPageBL registerNewCurrency(){
        CurrencyModel currencyModel = CurrencyModelRepository.getCurrencyModel();
        clickOnAddNewCurrencyButton();
        inputTitleCurrency(currencyModel.getCurrencyTitle());
        inputCodeCurrency(currencyModel.getCurrencyCode());
        inputValueCurrency(currencyModel.getCurrencyValue());
        chooseStatusCurrency(1);
        clickOnSaveNewCurrencyButton();
        successAddNewCurrency = new SuccessAddNewCurrency();
        return this;
    }

    private void inputTitleCurrency(String titleCurrency){
        currencyPage.getTitleCurrencyInput().clear();
        currencyPage.getTitleCurrencyInput().sendKeys(titleCurrency);
    }

    private void  inputCodeCurrency(String codeCurrency){
        currencyPage.getCodeCurrencyInput().clear();
        currencyPage.getCodeCurrencyInput().sendKeys(codeCurrency);
    }

    private void inputValueCurrency(String valueCurrency){
        currencyPage.getValueCurrencyInput().clear();
        currencyPage.getValueCurrencyInput().sendKeys(valueCurrency);
    }

    private void chooseStatusCurrency(int value){
        new DriverUtils()
                .clickOnElementJS(currencyPage.getEnabledCurrency(value));
    }
    private void clickOnAddNewCurrencyButton(){
        currencyPage.getAddNewCurrenciesButton().click();
    }

    private void clickOnSaveNewCurrencyButton(){
        currencyPage.getCurrencySave().click();
    }

    public void verifyAddNewCurrency(){
        String expectedMessage = " Success: You have modified currencies! ";
        String actualResult = successAddNewCurrency.getSuccessAddNewCurrency().getText();
        Assert.assertEquals(expectedMessage,actualResult, "Incorrect page title");
    }
}
