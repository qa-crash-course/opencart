package com.crashcourse;

import com.opencart.navigation.Navigation;
import com.opencart.repository.CurrencyModelRepository;
import com.opencart.steps.AdminDashboardPageBL;
import com.opencart.steps.AdminLoginPageBL;
import com.opencart.steps.AdminMainPageBL;
import com.opencart.steps.CurrencyPageBL;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.opencart.enums.URLs.ADMIN_URL;

public class AddNewCurrencyTest extends BaseTest {
    private AdminDashboardPageBL adminDashboardPageBL;
    @Test
    public void addNewCurrency(){
        new Navigation().navigateToUrl( ADMIN_URL.getValue());
        AdminMainPageBL adminMainPageBL = new AdminMainPageBL();
        AdminLoginPageBL adminLoginPageBL = adminMainPageBL.getAdminLoginPageBL().loginAdminPerson();
        AdminDashboardPageBL adminDashboardPageBL = adminMainPageBL.getAdminDashboardPageBL();
        adminDashboardPageBL.verifyAdminLogin();

        CurrencyPageBL currencyPageBL = adminMainPageBL.getNavigateMenuAdminPageBL()
                .clickOnSystemButton()
                .clickOnLocalisationButton()
                .clickOnCurrencyButton()
                .registerNewCurrency();
        currencyPageBL.verifyAddNewCurrency();
    }
// тут буде видалення валюти після додавання
    @AfterMethod
    private void deleteCurrency(){
        CurrencyPageBL currencyPageBL = new CurrencyPageBL();
        currencyPageBL.deleteCurrency(CurrencyModelRepository.name);
        currencyPageBL.verifyDeleteCurrency();
    }
}