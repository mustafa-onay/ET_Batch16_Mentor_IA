package com.euroTech.tests.day04_basic_locators;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _7_PartialLinkText {
    public static void main(String[] args) {
        /**
         * open chrome browser and navigate to http://www.eurotech.study/
         * accept cookies if any
         * locate Sign Up button web element by using partial link text locator
         * get the text of web element and print it
         * click to the web element
         * close driver.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        //accept cookies
        driver.findElement(By.id("rcc-confirm-button")).click();

        WebElement signUpLink = driver.findElement(By.partialLinkText("n U"));

        System.out.println(signUpLink.getText());

        signUpLink.click();
        WebDriverFactory.wait(2);

        driver.quit();


    }
}
/**
 * 1- a tag'ı ve href attribute'u olan web elementlerde kullanılır...
 * 2- <a class="btn btn-light" href="https://www.uzunihsan.com/login">ABCDEF</a> --> web elementinde ABCDEF link text kısmıdır..
 * bu text'in unique (eşsiz) olan bir bölümü alınarak kullanılır.. mesela DEF kısmı olabilir... yazının sırası bozulmamalıdır.
 * 3- text kısmının bir bölümü alınmalıdır..
 */