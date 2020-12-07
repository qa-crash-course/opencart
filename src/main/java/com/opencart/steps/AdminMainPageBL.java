package com.opencart.steps;

public class AdminMainPageBL {

    public AdminLoginPageBL getAdminLoginPageBL(){
        return new AdminLoginPageBL();
    }
    public CurrencyPageBL getCurrencyPageBL(){
        return new CurrencyPageBL();
    }
    public NavigationMenuAdminPageBL getNavigateMenuAdminPageBL(){
        return new NavigationMenuAdminPageBL();
    }
    public AdminDashboardPageBL getAdminDashboardPageBL(){
        return new AdminDashboardPageBL();
    }
}