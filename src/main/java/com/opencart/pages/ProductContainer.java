package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductContainer {

    @FindBy(xpath = ".//*[@class='caption']/h4")
    private WebElement name;
    @FindBy(css = "* div:nth-child(2) > p:nth-child(2)")
    private WebElement description;
    @FindBy(className = ".price")
    private WebElement price;
    @FindBy(css = "* div:nth-child(2) > p:nth-child(3) > span:nth-child(1)")
    private WebElement priceExTax;
    @FindBy(css = "* div.button-group button i.fa.fa-shopping-cart")
    private WebElement shopingCartButton;
    @FindBy(css = "* div.button-group button i.fa.fa-heart")
    private WebElement wishListButton;
    @FindBy(css = "* div.button-group button i.fa.fa-exchange")
    private WebElement compareButton;

    public WebElement getName() {
        return name;
    }

    public WebElement getDescription() {
        return description;
    }

    public WebElement getPrice() {
        return price;
    }

    public WebElement getPriceExTax() {
        return priceExTax;
    }

    public WebElement getShopingCartButton() {
        return shopingCartButton;
    }

    public WebElement getWishListButton() {
        return wishListButton;
    }

    public WebElement getCompareButton() {
        return compareButton;
    }
}
