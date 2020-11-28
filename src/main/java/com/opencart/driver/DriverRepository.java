package com.opencart.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*
 * Class where we connect to the Browsers within selenium.WebDriver dependency
 * downloadWebDriver()
 * instanceWebBrowser()
 * closeBrowser()
 */

public class DriverRepository {

    public final static ThreadLocal<WebDriver> DRIVERS = new ThreadLocal<>();
    public static WebDriver webDriver;
    private static String browserName = "Firefox";

    private DriverRepository() {
    }

    public static void downloadWebDriver() {
        switch(browserName){
            case "Firefox" :
                WebDriverManager.firefoxdriver().setup();
                break;
            case "Chrome" :
                WebDriverManager.chromedriver().setup();
                break;
        }
    }

    public static void instanceWebBrowser(){
        switch(browserName){
            case "Firefox" :
                webDriver = new FirefoxDriver();
                break; //необязательно
            case "Chrome" :
                webDriver = new ChromeDriver();
                break;
        }
        DRIVERS.set(webDriver);
        webDriver.manage().window().maximize();
    }

    public static void closeBrowser() {
        webDriver.quit();
    }
}

