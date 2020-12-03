package com.opencart.steps;

import com.opencart.pages.AdminDashboardPage;
import org.testng.Assert;

public class AdminDashboardPageBL {

    private AdminDashboardPage adminDashboardPage;

    public AdminDashboardPageBL verifyAdminLogin(){
        adminDashboardPage = new AdminDashboardPage();
        String expectedMessage = "Dashboard";
        String actualMessage = adminDashboardPage.getSuccessAdminLoginTitle().getText();
        Assert.assertEquals(actualMessage,expectedMessage,"Incorrect Page or Title");
        return this;
    }
}