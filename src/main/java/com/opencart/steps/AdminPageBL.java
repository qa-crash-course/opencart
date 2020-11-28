package com.opencart.steps;

import com.opencart.datamodel.AdminPanelModel;
import com.opencart.pages.AdminPage;
import com.opencart.repository.AdminLoginRepository;

public class AdminPageBL {

    private AdminPage adminPage;

    public AdminPageBL(){
        adminPage = new AdminPage();
    }

    public AdminPageBL loginAdmin(){
        AdminPanelModel adminPanelModel = AdminLoginRepository.getAdminPanelModel();
        inputAdminUserName(adminPanelModel.getAdminUserName());
        inputAdminPassword(adminPanelModel.getAdminPassword());
        clickOnLoginAdminButton();


        return this;
    }

    private void inputAdminUserName(String adminUserName){
        adminPage.getAdminUserName().clear();
        adminPage.getAdminUserName().sendKeys(adminUserName);
    }

    private void inputAdminPassword(String adminPassword){
        adminPage.getAdminPassword().clear();
        adminPage.getAdminPassword().sendKeys(adminPassword);
    }

    private AdminPageBL clickOnLoginAdminButton(){
        adminPage.getAdminLoginButton().click();
        return this;
    }


}
