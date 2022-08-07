package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String args[]){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Workspace\\TestSuitAuto\\driver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        Navigation n1= new Navigation(driver);
        n1.navigator();

        Login l1= new Login(driver);
        l1.loginPanel();

        SelectItems s1= new SelectItems(driver);
        s1.addItems();

        CheckOut c1= new CheckOut(driver);
        c1.cart();
    }
}
