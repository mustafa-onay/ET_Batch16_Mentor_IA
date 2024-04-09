package com.euroTech.utilities;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    /**
     * write a static method
     * that is named getDriver
     * it takes a string parameter (browserType)
     * it will set up browser
     * it will return a driver based on parameter (chrome, firefox, safari, edge etc..)
     */

    public static WebDriver getDriver (String browserType){
        WebDriver driver = null;
        switch (browserType.toLowerCase()){
            case "chrome" :
                 driver = new ChromeDriver();
                 break;
            case "edge" :
                driver = new EdgeDriver();
                break;
            case "firefox" :
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Wrong driver type...");
        }
        driver.manage().window().setPosition(new Point(-1000,0));
        driver.manage().window().maximize();
        return driver;
    }

    public static void wait(int seconds){
        try {
            Thread.sleep(seconds*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
