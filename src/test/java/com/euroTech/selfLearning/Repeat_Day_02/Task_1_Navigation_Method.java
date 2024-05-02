package com.euroTech.selfLearning.Repeat_Day_02;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task_1_Navigation_Method {

    public static void main(String[] args) {
        /**
         * set up a firefox(chrome) driver
         * navigate to https://www.facebook.com/
         * then navigate to https://testrelic.com/
         * then navigate back
         * then navigate forward
         * then refresh page
         * then close driver
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        WebDriverFactory.wait(2);
        driver.get("https://www.facebook.com/");
        WebDriverFactory.wait(2);
        driver.navigate().to("https://testrelic.com/");
        WebDriverFactory.wait(2);
        driver.navigate().back();
        WebDriverFactory.wait(2);
        driver.navigate().forward();
        WebDriverFactory.wait(2);
        driver.navigate().refresh();
        WebDriverFactory.wait(2);
        driver.close();
    }
}
