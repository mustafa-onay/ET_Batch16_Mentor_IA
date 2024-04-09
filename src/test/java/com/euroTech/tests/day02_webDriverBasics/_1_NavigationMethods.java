package com.euroTech.tests.day02_webDriverBasics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _1_NavigationMethods {
    public static void main(String[] args) throws InterruptedException {

        /**
         * set up a firefox(chrome) driver
         * navigate to https://www.facebook.com/
         * then navigate to https://testrelic.com/
         * then navigate back
         * then navigate forward
         * then refresh page
         * then close driver
         */

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().setPosition(new Point(-1000,0));

        driver.get("https://www.facebook.com/");
        driver.manage().window().minimize();
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.navigate().to("https://testrelic.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.close();

    }
}
