package com.company.automation.base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.company.automation.utils.WaitUtils;

public class BasePage {

    protected WebDriver driver;
    protected WaitUtils wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WaitUtils(driver);
    }

    protected void click(By locator) {
        driver.findElement(locator).click();
    }
    protected void type(By locator, String text) {
       
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

	/*
	 * protected void type(By locator, String text) {
	 * driver.findElement(locator).clear();
	 * driver.findElement(locator).sendKeys(text); }
	 */

    protected String getText(By locator) {
        return driver.findElement(locator).getText();
    }
}
