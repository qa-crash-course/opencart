package com.opencart.steps;

import com.opencart.datamodel.NewCurrencyModel;
import com.opencart.pages.NewCurrencyPage;
import com.opencart.repository.AddNewCurrencyRepository;
import com.opencart.util.DriverUtils;

public class AddNewCurrencyBL {
    private NewCurrencyPage newCurrencyPage;

    public AddNewCurrencyBL() {
        newCurrencyPage = new NewCurrencyPage();
    }

    public AddNewCurrencyBL registerNewCurrency(){
        NewCurrencyModel addNewCurrencyModel = AddNewCurrencyRepository.getAddNewCurrencyRepository();
        inputTitleCurrency(addNewCurrencyModel.getCurrencyTitle());
        inputCodeCurrency(addNewCurrencyModel.getCurrencyCode());
        inputValueCurrency(addNewCurrencyModel.getCurrencyValue());
        chooseEnableCurrency(1);
        clickOnSaveCurrencyButton();

        return this;
    }

    private void  inputTitleCurrency(String currencyTitle){
        newCurrencyPage.getTitleCurrencyInput().clear();
        newCurrencyPage.getTitleCurrencyInput().sendKeys(currencyTitle);
    }

    private void inputCodeCurrency(String currencyCode){
        newCurrencyPage.getCodeCurrencyInput().clear();
        newCurrencyPage.getCodeCurrencyInput().sendKeys(currencyCode);
    }

    private void inputValueCurrency(String currencyValue){
        newCurrencyPage.getValueCurrencyInput().clear();
        newCurrencyPage.getValueCurrencyInput().sendKeys(currencyValue);
    }

    private void chooseEnableCurrency(int value) {
        new DriverUtils()
                .clickOnElementJS(newCurrencyPage.getEnabledCurrency(value));
    }

    private AddNewCurrencyBL clickOnSaveCurrencyButton() {
        newCurrencyPage.getCurrencySave().click();
        return this;
    }
}

