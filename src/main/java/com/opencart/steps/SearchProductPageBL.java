package com.opencart.steps;

import com.opencart.pages.ProductContainer;
import com.opencart.pages.SearchProductPage;
import com.opencart.pages.SearchProductResultPage;
import org.testng.Assert;

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

    public void verifySearchResult(String searchCriteria) {
        Assert.assertTrue(findAllProductBySearchCriteria(searchCriteria));
    }

    private boolean findAllProductBySearchCriteria(String searchCriteria) {
        List<ProductContainer> productContainers = searchProductResultPage.getProductContainers();
        for (ProductContainer productContainer : productContainers) {
            if (!productContainer.getName().contains(searchCriteria)) {
                return false;
            }
        }
        return true;
    }

    private SearchProductPageBL clickOnSearchGroupButton() {
        searchProductPage.getInputSearchGroupButton().click();
        return this;
    }
}