package com.opencart.steps;

import com.opencart.pages.AdminDashboardPage;
import io.qameta.allure.Step;
import org.testng.Assert;

public class AdminDashboardPageBL {

    private AdminDashboardPage adminDashboardPage;

    @Step("Check if the Admin is logged in " )
    public AdminDashboardPageBL verifyAdminLogin(){
        adminDashboardPage = new AdminDashboardPage();
        String expectedMessage = "Dashboard";
        String actualMessage = adminDashboardPage.getSuccessAdminLoginTitle().getText();
        Assert.assertEquals(actualMessage,expectedMessage,"Incorrect Page or Title");
        return this;
    }
}