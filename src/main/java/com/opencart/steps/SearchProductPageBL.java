package com.opencart.steps;

import com.opencart.pages.SearchProductPage;
import com.opencart.pages.SuccessSearchProductResultPage;
import org.testng.Assert;

/*
* Class that describes steps (Business logic) of searching product
* with correct search criteria "mac"
 */

public class SearchProductPageBL {

    private SearchProductPage searchProductPage;
    private SuccessSearchProductResultPage successSearchProductResultPage;

    public SearchProductPageBL() {
        searchProductPage = new SearchProductPage();
    }

    public SearchProductPageBL makeSearch() {
        searchProductPage.getInputSearchCriteria().clear();
        searchProductPage.getInputSearchCriteria().sendKeys("mac");
        clickOnContinueButton();
        successSearchProductResultPage = new SuccessSearchProductResultPage();
        return this;
    }

    public void verifySearchResult() {
        String expectedMessage = "Products meeting the search criteria";
        Assert.assertEquals(
                successSearchProductResultPage.getSuccessTitle().getText(),
                expectedMessage, "Incorrect Search result");
    }

    private SearchProductPageBL clickOnContinueButton() {
        searchProductPage.getInputSearchGroupButton().click();
        return this;
    }

}
