package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    private WebDriver driver;
    public Login(WebDriver driver){
        this.driver=driver;
    }
    public void loginPanel(){
        String username="standard_user";
        String password="secret_sauce";

        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

    }
}
