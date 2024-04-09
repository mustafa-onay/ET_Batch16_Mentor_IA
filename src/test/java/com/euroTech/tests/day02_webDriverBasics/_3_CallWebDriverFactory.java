package com.euroTech.tests.day02_webDriverBasics;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class _3_CallWebDriverFactory {
    public static void main(String[] args) {
        /**
         * set up a chrome driver with WebDriverFactory
         * navigate to https://tr-tr.facebook.com/
         * verify that the url is correct
         */

        WebDriver driver = WebDriverFactory.getDriver("cHromE");

        driver.get("https://tr-tr.facebook.com/");

        String actualURL = driver.getCurrentUrl();
        String expectedURL = "https://tr-tr.facebook.com/";

        WebDriverFactory.wait(2);

        if (actualURL.equals(expectedURL))
            System.out.println("Pass");
        else
            System.out.println("Fail");

        driver.quit();


    }
}
