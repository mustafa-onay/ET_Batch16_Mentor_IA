package com.euroTech.selfLearning.Repeat_Day_03;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_1_Verify_Url_Is_Not_Changed {

    public static void main(String[] args) {
        /**
         * open Chrome browser
         * go to https://www.krafttechexlab.com/login
         * click on login button (by tag name)
         * VERIFY that url is not changed
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        

    }
}
