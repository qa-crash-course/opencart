package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
 * Class that describe search element of the main page
 */

public class SearchProductPage extends BasePage {
    @FindBy(xpath = ".//input[@name='search']")
    private WebElement inputSearchCriteria;
    @FindBy(css = "*.fa-search")
    private WebElement inputSearchGroupButton;

    public WebElement getInputSearchCriteria() {
        return inputSearchCriteria;
    }

    public WebElement getInputSearchGroupButton() {
        return inputSearchGroupButton;
    }
}
