package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class LoginPage {

    private WebDriver driver;
    private By userName = By.id("user-name");
    private By pass = By.id("password");
    private By submit = By.id("login-button");

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public FilterAndAddCartPage loginForm()
    {
        driver.findElement(userName).sendKeys("standard_user");
        driver.findElement(pass).sendKeys("secret_sauce");
        driver.findElement(submit).click();
        Assert.assertTrue(true,"Swag Labs");
        return new FilterAndAddCartPage(driver);

    }


}
