package com.opencart.steps;

import com.opencart.pages.HeaderPage;

public class HeaderPageBL {

    private HeaderPage headerPage;

    public HeaderPageBL() {
        headerPage = new HeaderPage();
    }

    public HeaderPageBL clickOnMyAccountButton() {
        headerPage.getMyAccountButton().click();
        return this;
    }

    public RegisterPageBL clickOnRegisterButton() {
        headerPage.getRegisterButton().click();
        return new RegisterPageBL();
    }

    public LoginPageBL clickOnLoginButton(){
        headerPage.getLoginButton().click();
        return new LoginPageBL();
    }
//кнопка логаут у хедері
    public LogoutPageBL clickOnLogoutButton(){
        headerPage.getLogoutButton().click();
        return new LogoutPageBL();
    }
}
