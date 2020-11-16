package com.opencart.steps;

import com.opencart.pages.ProductContainer;
import com.opencart.pages.SearchProductResultPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class SearchProductResultPageBL {
    private SearchProductResultPage searchProductResultPage;

    public SearchProductResultPageBL() {
        searchProductResultPage = new SearchProductResultPage();
    }

    public void verifyPositiveSearchResultWithCategory(String searchCriteria, String category) {
        SoftAssert softAssert = new SoftAssert();
        String expectedResult = "Products meeting the search criteria";
        String actualResult = searchProductResultPage.getSuccessTitle().getText();
        softAssert.assertEquals(expectedResult, actualResult, "Title is correct, now you can check the list of products");
        softAssert.assertTrue(selectCategoryFromDropdown(category));
        softAssert.assertTrue(findAllProductBySearchCriteria(searchCriteria),
                "Check the list of products Done!");
        softAssert.assertAll();
    }

    private boolean findAllProductBySearchCriteria(String searchCriteria) {
        List<ProductContainer> productContainers = searchProductResultPage.getProductContainers();
        boolean isProductListContainsSearchCriteria = true;
        for (ProductContainer productContainer : productContainers) {
            if (!productContainer.getName().contains(searchCriteria)) {
                isProductListContainsSearchCriteria = false;
            }
        }
        return isProductListContainsSearchCriteria;
    }

    public SearchProductResultPageBL makeSearch(String phrase, String category) {
        searchProductResultPage.getSearchPlaceholder().clear();
        searchProductResultPage.getSearchPlaceholder().sendKeys(phrase);
        selectCategoryFromDropdown(category);
        clickOnSearchButton();
        searchProductResultPage = new SearchProductResultPage();
        return this;
    }

    private SearchProductResultPageBL clickOnSearchButton() {
        searchProductResultPage.getSearchButton().click();
        return this;
    }

    public boolean selectCategoryFromDropdown(String category) {
        Select select = new Select(searchProductResultPage.getCategoryContainers());
        List<WebElement> optionList = select.getOptions();
        boolean isCorrectCategory = true;
        for (WebElement option : optionList) {
            boolean contains = option.getText().trim().contains(category);
            if (!contains) {
                isCorrectCategory = false;
            } else {
                select.selectByVisibleText(category);
            }
        }
//        System.out.println("some text when the code runs ok");
        return isCorrectCategory;
    }
}
