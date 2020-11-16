package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

/*
 * Class that is useful in SearchProductTest verifying method
 */

public class SearchProductResultPage extends BasePage {
    @FindBy(xpath = ".//div/h2")
    private WebElement successTitle;
    @FindBy(xpath = ".//div/h2/following-sibling::p")
    private WebElement noProductsFoundTitle;
    @FindBy(className = ".product-layout")
    private List<WebElement> productContainers;
    @FindBy(xpath = ".//input[@value='Search']")
    private WebElement searchButton;
    @FindBy(xpath = ".// *[@name ='category_id']")
    private WebElement categoryContainers;
    @FindBy(id = "input-search")
    private WebElement searchPlaceholder;

    public WebElement getSearchPlaceholder() {
        return searchPlaceholder;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getCategoryContainers() {
        return categoryContainers;
    }

    public WebElement getSuccessTitle() {
        return successTitle;
    }

    public WebElement getNoProductsFoundTitle() {
        return noProductsFoundTitle;
    }

    public List<ProductContainer> getProductContainers() {
        List<ProductContainer> list = new ArrayList<>();
        for (WebElement productContainer : productContainers) {
            ProductContainer container = new ProductContainer(productContainer);
            list.add(container);
        }
        return list;
    }
}
