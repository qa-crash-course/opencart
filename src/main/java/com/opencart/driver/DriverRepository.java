package com.opencart.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * Class where we connect to the Browsers within selenium.WebDriver dependency
 * downloadWebDriver()
 * instanceWebBrowser()
 * closeBrowser()
 */

public class DriverRepository {

    public final static ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    public static WebDriver webDriver;

    private DriverRepository() {
    }

    public static void downloadWebDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static void instanceWebBrowser() {
        webDriver = new ChromeDriver();
        DRIVERS.set(webDriver);
        webDriver.manage().window().maximize();
    }

    public static void closeBrowser() {
        webDriver.quit();
    }
}

