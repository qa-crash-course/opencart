package com.opencart.steps;

import com.opencart.pages.ProductContainer;
import com.opencart.pages.SearchProductPage;
import com.opencart.pages.SearchProductResultPage;
import org.testng.asserts.SoftAssert;

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
        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "There is no product that matches the search criteria.";
        String actualResult = searchProductResultPage.getNoProductsFoundTitle().getText();
        softAssert.assertEquals(expectedResult, actualResult, "Search criteria is actually correct");
        softAssert.assertTrue(findAllProductBySearchCriteria(searchCriteria),
                "Check the list of products Done!");

        /* Our test will fail with searchProductWithCorrectSearchCriteria()
         * in SearchProductTest class when we use assertAll method
         * softAssert.assertAll();
         */
    }

    private boolean findAllProductBySearchCriteria(String searchCriteria) {
        List<ProductContainer> productContainers = searchProductResultPage.getProductContainers();
        boolean isProductListContainsSearchCriteria = true;
        for (ProductContainer productContainer : productContainers) {
            if (!productContainer.getName().contains(searchCriteria)) {
                return isProductListContainsSearchCriteria = false;
            }
        }
        return isProductListContainsSearchCriteria;
    }

    private SearchProductPageBL clickOnSearchGroupButton() {
        searchProductPage.getInputSearchGroupButton().click();
        return this;
    }
}
