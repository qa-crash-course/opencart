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
    @FindBy(xpath = ".//p[contains(text(),'no product')]")
    private WebElement noProductsFoundTitle;
    @FindBy(className = ".product-layout")
    private List<WebElement> productContainers;

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
