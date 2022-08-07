package org.example;

import org.openqa.selenium.WebDriver;

public class Navigation {
    private WebDriver driver;
    public Navigation(WebDriver driver){
        this.driver=driver;
    }
    public void navigator(){
        String url= "https://www.saucedemo.com/";
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
}
