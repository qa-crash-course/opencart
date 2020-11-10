package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProduct extends BasePage {

    @FindBy(xpath=".//input[@name='search']")
    private WebElement inputSearch;
    @FindBy(css = "*.fa-search")
    private WebElement inputSearchGroupButton;
    @FindBy(xpath =".//input[@value='Search']")
    private WebElement searchButton;

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public WebElement getInputSearchGroupButton() {
        return inputSearchGroupButton;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}
