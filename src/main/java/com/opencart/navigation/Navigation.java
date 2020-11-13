package com.opencart.navigation;

import com.opencart.driver.DriverRepository;
import org.openqa.selenium.WebDriver;

/*
 * Class where we navigate to concrete URL
 * navigateToUrl(String url)
 */

public class Navigation {
    private WebDriver driver;

    public Navigation() {
        driver = DriverRepository.DRIVERS.get();
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }
}
