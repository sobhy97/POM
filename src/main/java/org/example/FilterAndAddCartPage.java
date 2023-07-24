package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterAndAddCartPage {

    private WebDriver driver;
    private By prod1 = By.id("add-to-cart-sauce-labs-onesie");
    private By prod2 = By.id("add-to-cart-sauce-labs-bike-light");
    private By prod3 = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
    private By remove = By.id("remove-sauce-labs-bolt-t-shirt");
    private By cart_icon = By.className("shopping_cart_link");

    public FilterAndAddCartPage(WebDriver driver)
    {
        this.driver= driver;
    }

    public void clickOnfilter()
    {
        Select select = new Select(driver.findElement(By.className("product_sort_container")));
        select.selectByIndex(2);
    }

    public void addToCart()
    {
        driver.findElement(prod1).click();
        driver.findElement(prod2).click();
        driver.findElement(prod3).click();
    }

    public void removeProduct()
    {
        driver.findElement(cart_icon).click();
        driver.findElement(remove).click();
    }


}
