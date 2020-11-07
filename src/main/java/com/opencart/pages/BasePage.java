package com.opencart.pages;

import com.opencart.driver.DriverRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage() {
        driver = DriverRepository.DRIVERS.get();
        PageFactory.initElements(driver, this);
    }
}
