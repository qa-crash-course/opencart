package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 * Class ProductContainer describes the structure of our Product Card
 * at the OpenCart site
 */

public class ProductContainer {
    private WebElement productLayout;

    public ProductContainer(WebElement productLayout) {
        this.productLayout = productLayout;
    }

    public String getName() {
        return this.productLayout.findElement(
                By.xpath(".//*[@class='caption']/h4")).getText();
    }

    public String getDescription() {
        return this.productLayout.findElement(
                By.cssSelector("* div:nth-child(2) > p:nth-child(2)")).getText();
    }

    public String getPrice() {
        return this.productLayout.findElement(
                By.className(".price")).getText();
    }

    public String getPriceExTax() {
        return this.productLayout.findElement(
                By.cssSelector("* div.button-group button i.fa.fa-shopping-cart")).getText();
    }

    public String getShopingCartButton() {
        return this.productLayout.findElement(
                By.cssSelector("* div.button-group button i.fa.fa-shopping-cart")).getText();
    }

    public String getWishListButton() {
        return this.productLayout.findElement(
                By.cssSelector("* div.button-group button i.fa.fa-heart")).getText();
    }

    public String getCompareButton() {
        return this.productLayout.findElement(
                By.cssSelector("* div.button-group button i.fa.fa-exchange")).getText();
    }
}
