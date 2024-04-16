package com.euroTech.tests.day04_basic_locators;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _4_SameClassName {
    public static void main(String[] args) {
        /**
         * open chrome browser and navigate to https://demoqa.com/text-box
         * locate Full Name label web element by using class name locator
         * get the text of web element and print it
         * close driver.
         */


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box");
        WebElement fullNameLabel = driver.findElement(By.className("form-label"));
        String text = fullNameLabel.getText();
        System.out.println(text);
        driver.close();

    }
}
