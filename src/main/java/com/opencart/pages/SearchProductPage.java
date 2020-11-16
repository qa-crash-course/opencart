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
    //searchButton and categoryContainers work perfectly from this Page
    @FindBy(xpath = ".//input[@value='Search']")
    private WebElement searchButton;
    @FindBy(xpath = ".// *[@name ='category_id']")
    private WebElement categoryContainers;

    public WebElement getCategoryContainers() {
        return categoryContainers;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getInputSearchCriteria() {
        return inputSearchCriteria;
    }

    public WebElement getInputSearchGroupButton() {
        return inputSearchGroupButton;
    }
}