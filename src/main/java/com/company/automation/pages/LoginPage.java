package com.company.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.company.automation.base.BasePage;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private By username = By.cssSelector("input[type='email']");
    private By password = By.cssSelector("input[type='password']");
    private By CBCaptcha  = By.id("captcha-checkbox");
    private By loginBtn = By.xpath("//button[contains(text(),'Log In')]");

    public void login(String user, String pass) {
        type(username, user);
        type(password, pass);
        click(CBCaptcha);
        click(loginBtn);
    }
}
