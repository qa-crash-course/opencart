package com.opencart.steps;

import com.opencart.datamodel.AdminLoginModel;
import com.opencart.pages.AdminLoginPage;
import com.opencart.pages.AdminDashboardPage;
import com.opencart.repository.AdminLoginRepository;
import io.qameta.allure.Step;
import org.testng.Assert;

public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPage;

    public AdminLoginPageBL(){
        adminLoginPage = new AdminLoginPage();
    }
    @Step("Admin login in" )
    public AdminLoginPageBL loginAdminPerson(){
        AdminLoginModel adminLoginModel = AdminLoginRepository.getAdminLoginModel();
        inputAdminUserName(adminLoginModel.getAdminUserName());
        inputAdminPassword(adminLoginModel.getAdminPassword());
        clickOnLoginAdminButton();
        return this;
    }

    private void inputAdminUserName(String adminUserName){
        adminLoginPage.getInputAdminUserName().clear();
        adminLoginPage.getInputAdminUserName().sendKeys(adminUserName);
    }

    private void inputAdminPassword(String adminPassword){
        adminLoginPage.getInputAdminPassword().clear();
        adminLoginPage.getInputAdminPassword().sendKeys(adminPassword);
    }

    private AdminLoginPageBL clickOnLoginAdminButton(){
        adminLoginPage.getAdminLoginButton().click();
        return  this;
    }
}