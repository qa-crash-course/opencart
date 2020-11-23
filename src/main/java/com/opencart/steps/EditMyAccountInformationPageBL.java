package com.opencart.steps;

import com.opencart.datamodel.EditAccountModel;
import com.opencart.pages.EditMyAccountInformationPage;
import com.opencart.pages.SuccessEditPage;
import com.opencart.repository.EditAccountModelRepository;
import org.testng.Assert;

public class EditMyAccountInformationPageBL {
    private EditMyAccountInformationPage editMyAccountInformationPage;
    private SuccessEditPage successEditPage;

    public EditMyAccountInformationPageBL() {
        editMyAccountInformationPage = new EditMyAccountInformationPage();
    }

    public EditMyAccountInformationPageBL editUserAccount() {
        EditAccountModel editAccountModel = EditAccountModelRepository.getEditAccountModel();
        inputFirstName(editAccountModel.getFirstName());
        inputLastName(editAccountModel.getLastName());
        inputEmail(editAccountModel.getEmail());
        inputTelephone(editAccountModel.getTelephone());
        clickOmContinueButton();

        successEditPage = new SuccessEditPage();
        return this;
    }

    private void inputFirstName(String firstName) {
        editMyAccountInformationPage.getFirstNameEditInput().clear();
        editMyAccountInformationPage.getFirstNameEditInput().sendKeys(firstName);
    }

    private void inputLastName(String lastName) {
        editMyAccountInformationPage.getLastNameEditInput().clear();
        editMyAccountInformationPage.getLastNameEditInput().sendKeys(lastName);
    }

    private void inputEmail(String email) {
        editMyAccountInformationPage.getEmailEditInput().clear();
        editMyAccountInformationPage.getEmailEditInput().sendKeys(email);
    }

    private void inputTelephone(String telephone) {
        editMyAccountInformationPage.getTelephoneInput().clear();
        editMyAccountInformationPage.getTelephoneInput().sendKeys(telephone);
    }

    private void clickOmContinueButton() {
        editMyAccountInformationPage.getContinueButton().click();
    }

    public void verifyUserEditInformation() {
        String expectedMessage = "Success: Your account has been successfully updated.";
        Assert.assertEquals(successEditPage.getSuccessEditTitle().getText(), expectedMessage, "Incorrect page title");
    }
}
