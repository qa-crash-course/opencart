package com.opencart.steps;

import com.opencart.datamodel.AdminLoginModel;
import com.opencart.pages.AdminLoginPage;
import com.opencart.pages.SuccessAdminLoginPage;
import com.opencart.pages.SuccessLoginPage;
import com.opencart.repository.AdminLoginRepository;
import org.testng.Assert;

public class AdminLoginPageBL {
    private AdminLoginPage adminLoginPage;
    private SuccessAdminLoginPage successAdminLoginPage;

    public AdminLoginPageBL(){
        adminLoginPage = new AdminLoginPage();
    }

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

    public AdminLoginPageBL verifyAdminLogin(){
        successAdminLoginPage = new SuccessAdminLoginPage();
        String expectedMessage = "Dashboard";
        String actualMessage = successAdminLoginPage.getSuccessAdminLoginTitle().getText();
        Assert.assertEquals(actualMessage,expectedMessage,"Incorrect Page Title");
        return this;
    }
}
