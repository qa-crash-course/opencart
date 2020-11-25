package com.opencart.steps;

import com.opencart.pages.EditAccountPage;

public class EditAccountBL {

    private EditAccountPage editAccountPage;

    public EditAccountBL() {
        editAccountPage = new EditAccountPage();
    }

    public EditMyAccountInformationPageBL clickOnEditAccountButton() {
        editAccountPage.getEditAccountButton().click();
        return new EditMyAccountInformationPageBL();
    }
}
