package com.euroTech.selfLearning.Repeat_Day_02;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class Task_2_GetMethods {

    public static void main(String[] args) {
        /**
         * set up a chrome driver
         * navigate to https://www.hepsiburada.com/
         * get title and get url get page source code
         * verify that title, url and Page source codes  contain "hepsiburada"
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.hepsiburada.com/");

        String actualTitle = driver.getTitle();

        String currentUrl = driver.getCurrentUrl();

        String pageSource = driver.getPageSource();

        String expectedData = "hepsiburada";

        if (actualTitle.toLowerCase().contains(expectedData) && currentUrl.toLowerCase().contains(expectedData) && pageSource.toLowerCase().contains(expectedData)) {
            System.out.println("Passed");
        }else
            System.out.println("Failed");

        System.out.println("actualTitle = " + actualTitle);
        System.out.println("currentUrl = " + currentUrl);

        WebDriverFactory.wait(2);
        driver.close();
    }

}
