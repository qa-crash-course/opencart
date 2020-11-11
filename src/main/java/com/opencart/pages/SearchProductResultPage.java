package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

/*
 * Class that is useful in SearchProductTest
 */

public class SearchProductResultPage extends BasePage {
    @FindBy(xpath = ".//div/h2")
    private WebElement successTitle;

    public WebElement getSuccessTitle() {
        return successTitle;
    }

    public boolean foundProduct(String productName) {
        List<WebElement> products = driver.findElements(
                By.xpath(".//*[@class='caption']/h4"));
        for (WebElement product : products) {
            if (product.getText().contains(productName))
                return true;
        }
        return false;
    }
}
