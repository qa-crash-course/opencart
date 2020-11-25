package com.opencart.steps;

import com.opencart.pages.LogoutPage;
import com.opencart.pages.SuccessLogoutPage;
import org.testng.Assert;

public class LogoutPageBL {
    private LogoutPage logoutPage;
    private SuccessLogoutPage successLogoutPage;

    public LogoutPageBL() {
        logoutPage = new LogoutPage();
    }

    public LogoutPageBL verifyUserLogout() {
        successLogoutPage = new SuccessLogoutPage();
        String expectedMessageLogout = "Account Logout";
        String actualMessageLogout = successLogoutPage.getSuccessLogoutTitle().getText();
        Assert.assertEquals(actualMessageLogout, expectedMessageLogout, "Incorrect page title");
        return this;
    }
}
