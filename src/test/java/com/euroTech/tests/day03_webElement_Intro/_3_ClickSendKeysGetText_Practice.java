package com.euroTech.tests.day03_webElement_Intro;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _3_ClickSendKeysGetText_Practice {

    public static void main(String[] args) {
        /**
         * Open chore browser
         * navigate to https://www.amazon.com/
         * write "Java" to the search bar
         * click search button
         * get result for text
         * verify that the text contains "Java"
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get(" https://www.amazon.com.tr");

        WebDriverFactory.wait(2);

        driver.findElement(By.id("sp-cc-accept")).click();

        WebDriverFactory.wait(2);

        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Java");

        WebDriverFactory.wait(2);

        WebElement searchBtn = driver.findElement(By.id("nav-search-submit-button"));
        searchBtn.click();

        WebElement searchResultElement = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        String actualText = searchResultElement.getText();
        String expectedText = "Java";

        WebDriverFactory.wait(2);

        if (actualText.contains(expectedText))
            System.out.println("Pass");
        else
            System.out.println("Fail");

        driver.close();
    }
}
