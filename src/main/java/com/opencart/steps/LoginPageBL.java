package com.opencart.steps;

import com.opencart.datamodel.LoginModel;
import com.opencart.pages.LoginPage;
import com.opencart.pages.SuccessLoginPage;
import com.opencart.repository.LoginModelRepository;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LoginPageBL {
    private LoginPage loginPage;
    private SuccessLoginPage successLoginPage;

    public LoginPageBL() {
        loginPage = new LoginPage();
    }

    @Step("Login person")
    public LoginPageBL loginPerson() {
        LoginModel loginModel = LoginModelRepository.getLoginModel();
        inputEmail(loginModel.getEmail());
        inputPassword(loginModel.getPassword());
        clickOnLoginButton();

        successLoginPage = new SuccessLoginPage();
        return this;
    }

    private void inputEmail(String email) {
        loginPage.getEmailInput().clear();
        loginPage.getEmailInput().sendKeys(email);
    }

    private void inputPassword(String password) {
        loginPage.getPasswordInput().clear();
        loginPage.getPasswordInput().sendKeys(password);
    }

    private LoginPageBL clickOnLoginButton() {
        loginPage.getLoginButton().click();
        return this;
    }

    @Step("Check if the User is logged in " )
    public void verifyUserLogin() {
        String expectedMessageLogin = "My Account";
        String actualMessageLogin = successLoginPage.getSuccessLoginTitle().getText();
        Assert.assertEquals(actualMessageLogin, expectedMessageLogin, "Incorrect page title");
    }
}