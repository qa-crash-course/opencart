package com.opencart.steps;

import com.opencart.datamodel.CurrencyModel;
import com.opencart.pages.CurrencyPage;
import com.opencart.pages.SuccessAddNewCurrency;
import com.opencart.pages.SuccessDeleteCurrency;
import com.opencart.repository.CurrencyModelRepository;
import com.opencart.util.DriverUtils;
import io.qameta.allure.Step;
import org.testng.Assert;

public class CurrencyPageBL {

    private CurrencyPage  currencyPage;
    private SuccessAddNewCurrency successAddNewCurrency;
    private SuccessDeleteCurrency successDeleteCurrency;

    public CurrencyPageBL (){
        currencyPage = new CurrencyPage();
    }

    @Step("Entry data  a new currency" )
    public CurrencyPageBL registerNewCurrency(){
        CurrencyModel currencyModel = CurrencyModelRepository.getCurrencyModel();
        clickOnAddNewCurrencyButton();
        inputTitleCurrency(currencyModel.getCurrencyTitle());
        inputCodeCurrency(currencyModel.getCurrencyCode());
        inputValueCurrency(currencyModel.getCurrencyValue());
        chooseStatusCurrency(0);
        clickOnSaveNewCurrencyButton();

        return this;
    }
    @Step("delete currency" )
    public CurrencyPageBL deleteCurrency(String currencyName){
        DriverUtils driverUtils = new DriverUtils();
        clickOnCurrencyCheckBox(currencyName);
        clickOnDeleteCurrencyButton();
        driverUtils.acceptAlert();


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

    private void chooseStatusCurrency(int element){
        currencyPage.getEnableStatusValue().selectByIndex(element);
    }
    private void clickOnAddNewCurrencyButton(){
        currencyPage.getAddNewCurrenciesButton().click();
    }
    private void clickOnDeleteCurrencyButton(){
        currencyPage.getDeleteCurrency().click();
    }
    private void clickOnSaveNewCurrencyButton(){
        currencyPage.getCurrencySave().click();
    }
    private void clickOnCurrencyCheckBox(String currencyName){currencyPage.getCurrencyCheckbox(currencyName).click();}

    @Step("verifyAddNewCurrency")
    public void verifyAddNewCurrency(){
        successAddNewCurrency = new SuccessAddNewCurrency();
        String expectedMessage = "Success: You have modified currencies!";
        String actualMessage = successAddNewCurrency.getSuccessAddNewCurrency().getText();
        Assert.assertEquals(expectedMessage, actualMessage.replaceAll("×"," ").trim(), "Incorrect page title");
    }

    public void verifyDeleteCurrency(){
        successDeleteCurrency = new SuccessDeleteCurrency();
        String expectedMessage = "Success: You have modified currencies!";
        String actualMessage = successDeleteCurrency.getSuccessDeleteCurrency().getText();
        Assert.assertEquals(expectedMessage, actualMessage.replaceAll("×"," ").trim(), "Incorrect page title");
    }
}