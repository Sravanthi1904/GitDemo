package com.company.automation.pages;

import org.openqa.selenium.WebDriver;
import com.company.automation.base.BasePage;

public class DashboardPage extends BasePage {

    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    public String getPageTitle() {
        return driver.getTitle();
    }	
}
