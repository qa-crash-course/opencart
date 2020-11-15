package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategorieContainer {
    private WebElement categoryElement;

    CategorieContainer(WebElement categoryElement){
        this.categoryElement = categoryElement;
    }

    public String getDesktopCategorie(){
       return this.categoryElement.findElement(
                By.cssSelector("select.form-control > option:nth-child(2)")).getText();
    }
    public String getPcCategorie(){
        return this.categoryElement.findElement(
                By.cssSelector("select.form-control > option:nth-child(3)")).getText();
    }
    public String getMacCategorie(){
        return this.categoryElement.findElement(
                By.cssSelector("select.form-control > option:nth-child(4)")).getText();
    }
    public String getLaptopCategorie(){
        return this.categoryElement.findElement(
                By.cssSelector("select.form-control > option:nth-child(5)")).getText();
    }
}
