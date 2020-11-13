package com.opencart.steps;

import com.opencart.pages.ProductContainer;
import com.opencart.pages.SearchProductPage;
import com.opencart.pages.SearchProductResultPage;
import org.testng.Assert;

import java.util.LinkedList;
import java.util.List;

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
//        String expectedMessage = "Products meeting the search criteria";
//        Assert.assertEquals(searchProductResultPage.getSuccessTitle().getText(),
//                expectedMessage, "Incorrect Search result");
      Assert.assertTrue(foundProductName(productName));
    }

    public boolean foundProductName(String productName) {
        List<ProductContainer> products = searchProductResultPage.getProducts();
        for (ProductContainer product : products) {
            if (product.getName().getText().contains(productName))
                return true;
        }
        return false;
    }



    private SearchProductPageBL clickOnSearchGroupButton() {
        searchProductPage.getInputSearchGroupButton().click();
        return this;
    }

}
