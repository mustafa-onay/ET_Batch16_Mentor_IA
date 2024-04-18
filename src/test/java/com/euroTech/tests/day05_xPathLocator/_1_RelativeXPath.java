package com.euroTech.tests.day05_xPathLocator;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1_RelativeXPath {
    public static void main(String[] args) {
        /**
         * open chrome
         * navigate to https://www.amazon.com.tr/
         * accept cookies if any (use xPath formula with known attribute value)
         * locate search bar with xPath formula with known attribute value
         * send "Selenium" word to the search bar
         * locate search button with xPath formula with known attribute value
         * click search button
         * Get the search result by the formula of the text feature of Xpath (two ways)  //text() , .
         * get the text of web element and print it.
         * close driver.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com.tr/");

        WebElement acceptCookies = driver.findElement(By.xpath("//input[@name='accept']"));
        acceptCookies.click();

        WebElement searchBar = driver.findElement(By.xpath("//input[@placeholder='Ara Amazon.com.tr']"));
        String item = "Selenium";
        searchBar.sendKeys(item);

        WebElement searchBtn = driver.findElement(By.xpath("//input[@value='Git']"));
        searchBtn.click();

        WebElement searchResultText = driver.findElement(By.xpath("//span[.='\"Selenium\"']"));
        System.out.println("searchResultText.getText() = " + searchResultText.getText());

        WebElement searchResultText1 = driver.findElement(By.xpath("//span[text()='\"Selenium\"']"));
        System.out.println("searchResultText1 = " + searchResultText1.getText());

        driver.close();

    }
}
