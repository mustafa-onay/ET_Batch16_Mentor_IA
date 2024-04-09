package com.euroTech.tests.day02_webDriverBasics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_GetMethods {
    public static void main(String[] args) {

        /**
         * set up a chrome driver
         * navigate to https://www.hepsiburada.com/
         * get title and get url get page source code
         * verify that title, url and Page source codes  contain "hepsiburada"
         */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().setPosition(new Point(-1000,0));
        driver.manage().window().maximize();

        driver.get("https://www.hepsiburada.com/");

        String actualTitle = driver.getTitle();

        String actualCurrentUrl = driver.getCurrentUrl();

        String actualPageSource = driver.getPageSource();

        String expectedData = "hepsiburada";

        if (actualTitle.toLowerCase().contains(expectedData) && actualCurrentUrl.toLowerCase().contains(expectedData)
                && actualPageSource.contains(expectedData)){
            System.out.println("Pass...!");
        }else {
            System.out.println("Failed...!");
        }

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("actualCurrentUrl = " + actualCurrentUrl);

     //   System.out.println("actualPageSource = " + actualPageSource);

        driver.close();

    }
}
