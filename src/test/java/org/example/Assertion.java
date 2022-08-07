package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Assertion {
    private WebDriver driver;
    public Assertion(WebDriver driver){
        this.driver=driver;
    }
    public void assertPages(){
        String item1="Sauce Labs Backpack";
        String item2="Sauce Labs Bike Light";
        String item3="Sauce Labs Bolt T-Shirt";
        String item4="Sauce Labs Fleece Jacket";

        Assert.assertEquals(driver.findElement(By.id("item_4_title_link")).getText(), item1);
        Assert.assertEquals(driver.findElement(By.id("item_0_title_link")).getText(), item2);
        Assert.assertEquals(driver.findElement(By.id("item_1_title_link")).getText(), item3);
        Assert.assertEquals(driver.findElement(By.id("item_5_title_link")).getText(), item4);

        System.out.println("Passed All");

    }
}
