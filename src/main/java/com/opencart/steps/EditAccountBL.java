package com.opencart.steps;

import com.opencart.pages.LeftSideMenuOptionsPage;

public class EditAccountBL {

    private LeftSideMenuOptionsPage leftSideMenuOptionsPage;

    public EditAccountBL() {
        leftSideMenuOptionsPage = new LeftSideMenuOptionsPage();
    }

    public EditMyAccountInformationPageBL clickOnEditAccountButton() {
        leftSideMenuOptionsPage.getEditAccountButton().click();
        return new EditMyAccountInformationPageBL();
    }
}
