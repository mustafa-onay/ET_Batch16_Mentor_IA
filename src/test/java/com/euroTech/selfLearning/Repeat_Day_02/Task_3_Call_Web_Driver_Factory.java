package com.euroTech.selfLearning.Repeat_Day_02;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task_3_Call_Web_Driver_Factory {

    public static void main(String[] args) {
        /**
         * set up a chrome driver with WebDriverFactory
         * navigate to https://tr-tr.facebook.com/
         * verify that the url is correct
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://tr-tr.facebook.com/");

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://tr-tr.facebook.com/";

        WebDriverFactory.wait(2);

        if (currentUrl.equals(expectedUrl)){
            System.out.println("Passed");
        }else
            System.out.println("Failed");

        WebDriverFactory.wait(2);

        driver.quit();


    }
}
