package com.opencart.steps;

import com.opencart.pages.NavigationMenuAdminPage;

public class NavigationMenuAdminPageBL {

    private NavigationMenuAdminPage navigationMenuAdminPage;

     public NavigationMenuAdminPageBL(){
         navigationMenuAdminPage = new NavigationMenuAdminPage();
     }

     public NavigationMenuAdminPageBL clickOnSystemButton(){
         navigationMenuAdminPage.getSystemButton().click();
         return this;
     }

     public NavigationMenuAdminPageBL clickOnLocalisationButton(){
         navigationMenuAdminPage.getLocalisationButton().click();
         return this;
     }

     public CurrencyPageBL clickOnCurrencyButton(){
         navigationMenuAdminPage.getCurrenciesButton().click();
         return new CurrencyPageBL();
     }
}