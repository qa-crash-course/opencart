package com.opencart.steps;


import com.opencart.pages.SuccessLogoutPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class LogoutPageBL {
    private SuccessLogoutPage successLogoutPage;

    @Step("Check if the User has logged out " )
    public LogoutPageBL verifyUserLogout() {
        successLogoutPage = new SuccessLogoutPage();
        String expectedMessageLogout = "Account Logout";
        String actualMessageLogout = successLogoutPage.getSuccessLogoutTitle().getText();
        Assert.assertEquals(actualMessageLogout, expectedMessageLogout, "Incorrect page title");
        return this;
    }
}