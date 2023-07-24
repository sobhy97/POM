package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class CheckoutPage {

    private WebDriver driver;
    private By checkoutBttn = By.id("checkout");
    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By zipCode = By.id("postal-code");
    private By continueBttn = By.id("continue");
    private By finish = By.id("finish");

    public CheckoutPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void checkOutFlow(String fName , String lName, String code)
    {
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(checkoutBttn).click();
        driver.findElement(firstName).sendKeys(fName);
        driver.findElement(lastName).sendKeys(lName);
        driver.findElement(zipCode).sendKeys(code);
        driver.findElement(continueBttn).click();
        Assert.assertTrue(true,"Payment Information");
        Assert.assertTrue(true,"Shipping Information");
        driver.findElement(finish).click();
        Assert.assertTrue(true,"Thank you for your order!");

    }

}
