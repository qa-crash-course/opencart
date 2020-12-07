package com.crashcourse;

import com.opencart.datamodel.CurrencyModel;
import com.opencart.navigation.Navigation;
import com.opencart.repository.CurrencyModelRepository;
import com.opencart.steps.AdminDashboardPageBL;
import com.opencart.steps.AdminLoginPageBL;
import com.opencart.steps.AdminMainPageBL;
import com.opencart.steps.CurrencyPageBL;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;
public class DeleteCurrencyTest  extends  BaseTest{

    @Test
    public void deleteCurrency(){
        new Navigation().navigateToUrl( ADMIN_URL.getValue());
        AdminMainPageBL adminMainPageBL = new AdminMainPageBL();
        AdminLoginPageBL adminLoginPageBL = adminMainPageBL.getAdminLoginPageBL()
                .loginAdminPerson();
        AdminDashboardPageBL adminDashboardPageBL = adminMainPageBL.getAdminDashboardPageBL();
        adminDashboardPageBL.verifyAdminLogin();

        CurrencyPageBL currencyPageBL = adminMainPageBL.getNavigateMenuAdminPageBL()
                .clickOnSystemButton()
                .clickOnLocalisationButton()
                .clickOnCurrencyButton()
                .deleteCurrency("Ім*я валюти");
        currencyPageBL.verifyDeleteCurrency();
    }
}
