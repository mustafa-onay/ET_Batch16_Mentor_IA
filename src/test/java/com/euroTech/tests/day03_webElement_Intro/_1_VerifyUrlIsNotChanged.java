package com.euroTech.tests.day03_webElement_Intro;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1_VerifyUrlIsNotChanged {
    public static void main(String[] args) {

        /**
         * Task
         * open chrome browser
         * go to https://www.krafttechexlab.com/login
         * click on login button
         * VERIFY that url is not changed
         */

        //open chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //go to https://www.krafttechexlab.com/login
        driver.get("https://www.krafttechexlab.com/login");

        WebElement loginBtn = driver.findElement(By.tagName("button"));
        loginBtn.click();

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.krafttechexlab.com/login";

        if (actualUrl.equals(expectedUrl))
            System.out.println("Pass");
        else
            System.out.println("Fail");

        driver.close();
    }
}
