package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductPage extends BasePage {
    @FindBy(xpath = "//div[@class='product-thumb transition']//*[@class='button-group']/*[@type='button'][1]")
    private List<WebElement> productNameButton;

    public List<WebElement> getProductNameButton() {
        return productNameButton;
    }
}
