package com.opencart.steps;

import com.opencart.datamodel.AddToShoppingCartModel;
import com.opencart.pages.AddToShoppingCartPage;
import com.opencart.pages.HeaderPage;
import com.opencart.pages.SuccessShoppingCartPage;
import com.opencart.repository.AddToShoppingCartModelRepository;
import com.opencart.util.DriverUtils;
import org.testng.Assert;

public class HeaderPageBL {

    private HeaderPage headerPage;
    private AddToShoppingCartPage addToShoppingCartPage;
    private SuccessShoppingCartPage successShoppingCartPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
        addToShoppingCartPage = new AddToShoppingCartPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public HeaderPageBL availableProductOptions() {
        AddToShoppingCartModel addToShoppingCartModel = AddToShoppingCartModelRepository.getAddToShoppingCartModel();
        inputText(addToShoppingCartModel.getTextInput());
        inputAreaText(addToShoppingCartModel.getTextAreaInput());
        clickOnRadioButton();
        clickOnCheckboxButton();
        clickAndChoiceSliderButton();
        clickOnUploadFileButton();
        clickOnAddToCartButton();

        successShoppingCartPage = new SuccessShoppingCartPage();
        return this;
    }

    public HeaderPageBL withoutProductOptions() {
        successShoppingCartPage = new SuccessShoppingCartPage();
        return this;
    }

    private void inputText(String text) {
        addToShoppingCartPage.getTextInputButton().clear();
        addToShoppingCartPage.getTextInputButton().sendKeys(text);
    }

    private void inputAreaText(String areaText) {
        addToShoppingCartPage.getTextAreaInputButton().clear();
        addToShoppingCartPage.getTextAreaInputButton().sendKeys(areaText);
    }

    private void clickOnRadioButton() {
        addToShoppingCartPage.getRadioButton().click();
    }

    private void clickOnCheckboxButton() {
        addToShoppingCartPage.getCheckboxButton().click();
    }

    private void clickAndChoiceSliderButton() {
        addToShoppingCartPage.getSliderButton1().click();
        addToShoppingCartPage.getSliderButton2().click();
    }

    private void clickOnUploadFileButton() {
        new DriverUtils().uploadFileElementJs(addToShoppingCartPage.getUploadFileButton(), "'C:\\test.jpg'");
    }

    private void clickOnAddToCartButton() {
        addToShoppingCartPage.getAddToCartButton().click();
    }

    public void verifyAddToCartTitle(String value) {
        String expectedMessage = "Success: You have added " + value + " to your shopping cart!\n×";
        String actualMessage = addToShoppingCartPage.successAddToTitle().getText();
        Assert.assertEquals(actualMessage, expectedMessage, "Incorrect title");
    }

    public ShoppingCartBL goToShoppingCartStore() {
        addToShoppingCartPage.getGoToShoppingCartStore().click();
        return new ShoppingCartBL();
    }
}
