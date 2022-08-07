package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelectDriver {
    public SelectDriver(){

    }
    public void driverChoose(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Workspace\\TestSuitAuto\\driver\\chromedriver.exe");
        WebDriver chromeDriver= new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\USER\\Workspace\\TestSuitAuto\\driver\\geckodriver.exe");
        WebDriver mozilaDriver=new FirefoxDriver();
    }
}
