package com.company.automation.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.company.automation.utils.ConfigReader;
import com.company.automation.utils.DriverFactory;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverFactory.initDriver();
        driver.get(ConfigReader.getProperty("baseUrl"));
        //driver.get("https://dev.nexus.pocketark.com/ui/#/login");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
           // driver.quit();
        }
    }
}
