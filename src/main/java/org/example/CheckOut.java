package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOut {
    private WebDriver driver;
    public CheckOut(WebDriver driver){
        this.driver=driver;
    }
    public void cart(){
        String f_name="Tester";
        String l_name="QA";
        String zip="1234";
        driver.findElement(By.id("shopping_cart_container")).click();
        driver.findElement(By.id("checkout")).click();

        driver.findElement(By.id("first-name")).sendKeys(f_name);
        driver.findElement(By.id("last-name")).sendKeys(l_name);
        driver.findElement(By.id("postal-code")).sendKeys(zip);
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("finish")).click();

        System.out.println("Checkout done");
    }
}
