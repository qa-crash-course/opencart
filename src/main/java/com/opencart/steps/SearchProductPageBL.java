package com.opencart.steps;

import com.opencart.pages.SearchProductPage;
import com.opencart.pages.SearchProductResultPage;
import org.testng.Assert;

/*
 * Class that describes steps (Business logic) of searching product
 * with correct search criteria that are located in SearchPhrases enum
 */

public class SearchProductPageBL {

    private SearchProductPage searchProductPage;
    private SearchProductResultPage searchProductResultPage;

    public SearchProductPageBL() {
        searchProductPage = new SearchProductPage();
    }

    public SearchProductPageBL makeSearch(String value) {
        searchProductPage.getInputSearchCriteria().clear();
        searchProductPage.getInputSearchCriteria().sendKeys(value);
        clickOnSearchGroupButton();
        searchProductResultPage = new SearchProductResultPage();
        return this;
    }

    public void verifySearchResult(String productName) {
        String expectedMessage = "Products meeting the search criteria";
        Assert.assertEquals(searchProductResultPage.getSuccessTitle().getText(),
                expectedMessage, "Incorrect Search result");
        Assert.assertTrue(searchProductResultPage.foundProduct(productName));
        Assert.assertFalse(false, "There is no product that matches the search criteria.");
    }

    private SearchProductPageBL clickOnSearchGroupButton() {
        searchProductPage.getInputSearchGroupButton().click();
        return this;
    }
}
