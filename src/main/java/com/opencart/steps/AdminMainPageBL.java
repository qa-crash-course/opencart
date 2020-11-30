package com.opencart.steps;

import com.opencart.datamodel.CurrencyModel;
import com.opencart.pages.CurrencyPage;

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
}
