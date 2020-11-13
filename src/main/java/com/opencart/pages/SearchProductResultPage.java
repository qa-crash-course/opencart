package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/*
 * Class that is useful in SearchProductTest verifying method
 */

public class SearchProductResultPage extends BasePage {
    @FindBy(xpath = ".//div/h2")
    private WebElement successTitle;

// ?Maybe I need some annotation here?
    private List<ProductContainer> products;

    public WebElement getSuccessTitle() {
        return successTitle;
    }

    public List<ProductContainer> getProducts() {
        return products;
    }
}
