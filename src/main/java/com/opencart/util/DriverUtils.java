package com.opencart.util;

import com.opencart.driver.DriverRepository;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverUtils {

    private WebDriver driver;

    public DriverUtils() {
        driver = DriverRepository.DRIVERS.get();
    }

    public void clickOnElementJS(WebElement webElement) {
        getJSExecutor().executeScript("arguments[0].click()", webElement);
    }

    private JavascriptExecutor getJSExecutor() {
        return (JavascriptExecutor) driver;
    }
}