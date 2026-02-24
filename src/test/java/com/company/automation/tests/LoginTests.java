package com.company.automation.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.company.automation.base.BaseTest;
import com.company.automation.pages.LoginPage;
import com.company.automation.utils.WaitUtils;

public class LoginTests extends BaseTest {

    @Test
    public void validLoginTest() {
        LoginPage login = new LoginPage(driver);
        login.login("saikrishna.pallikonda@radiant.digital", "Radiant@2028");
        //login.login("superadmin@pocketark.com", "cx9kGP*3fry4XOX");
        //WaitUtils wait = new WaitUtils(driver);
        //wait.waitForUrlContains("dashboard");
        System.out.println("Customer logged in successfully");
        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
    }
}
