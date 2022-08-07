package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectItems {
    private WebDriver driver;
    public SelectItems(WebDriver driver){
        this.driver=driver;
    }
    public void addItems(){
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt")).click();
        driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
        System.out.println("Items are Added");
    }
}
