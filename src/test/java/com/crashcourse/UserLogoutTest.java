package com.crashcourse;

import com.opencart.navigation.Navigation;
import com.opencart.steps.LoginPageBL;
import com.opencart.steps.LogoutPageBL;
import com.opencart.steps.MainPageBL;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.BASE_URL;

public class UserLogoutTest  extends BaseTest{
    @Test
    public void logoutUser() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
        MainPageBL mainPageBL = new MainPageBL();
        LoginPageBL loginPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLoginButton()
                .loginPerson();
        loginPageBL.verifyUserLogin();

        LogoutPageBL logoutPageBL = mainPageBL.getHeaderPageBL()
                .clickOnMyAccountButton()
                .clickOnLogoutButton();
        logoutPageBL.verifyUserLogout();
    }
}