package com.euroTech.tests.day04_basic_locators;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _5_ByTagName {
    public static void main(String[] args) {
        /**
         * open chrome browser and navigate to http://www.eurotech.study/
         * accept cookies if any
         * locate Copyright web element at the footer of the web page by using tag name locator
         * get the text of web element and print it
         * close driver.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        //accept cookies
        driver.findElement(By.id("rcc-confirm-button")).click();

        WebElement footer = driver.findElement(By.tagName("small"));
        System.out.println(footer.getText());

        driver.close();
    }
}
/**
 * 1- dinamik olmazlar..
 * 2- birden fazla olma durumu çok sıktır. eğer bu durumda kullanılırsa selenium ilk web elemente gider ve
 * onunla işlem yapar..
 * 3- unique (eşsiz) olup olmadığı dev tools arama (ctrl+f ile açılan yerde) bölümünde başına // işareti
 * konularak kontrol edilebilir..By.tagName("tagname") ile kullanılırken // işareti konulmadan kullanılır..
 * 4- index ile kullanılmaz..
 */