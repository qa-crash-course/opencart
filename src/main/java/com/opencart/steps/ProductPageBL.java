package com.opencart.steps;

import com.opencart.pages.ProductPage;

public class ProductPageBL {
    private ProductPage productPage;

    public ProductPageBL() {
        productPage = new ProductPage();
    }

    public HeaderPageBL clickOnProductNameButtonWithAddOptions() {
        productPage.getProductNameButton().get(2).click();
        return new HeaderPageBL();
    }

    public HeaderPageBL clickOnProductNameButtonWithoutAddOptions() {
        productPage.getProductNameButton().get(0).click();
        return new HeaderPageBL();
    }

}
