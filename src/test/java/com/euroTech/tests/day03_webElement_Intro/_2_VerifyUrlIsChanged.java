package com.euroTech.tests.day03_webElement_Intro;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2_VerifyUrlIsChanged {
    public static void main(String[] args) {
        /**
         * Task
         * open chrome browser
         * go to "https://demoqa.com/login"
         * enter "test" into the username box
         * VERIFY that "test" is displayed in the username box
         * enter "Test.!123" into the password box
         * click on login button
         * VERIFY that username is "test"
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.navigate().to("https://demoqa.com/login");

        String username = "test";

        WebDriverFactory.wait(2);

        WebElement usernameInput = driver.findElement(By.id("userName"));
        usernameInput.sendKeys(username);

        WebDriverFactory.wait(2);

        String actualUsername = usernameInput.getAttribute("value");


        if (actualUsername.equals(username))
            System.out.println("Username is correct.");
        else
            System.out.println("Username is wrong.");


        //lazy way
        driver.findElement(By.id("password")).sendKeys("Test.!123");

        WebElement loginBtn = driver.findElement(By.id("login"));
        loginBtn.click();

        WebDriverFactory.wait(2);

        WebElement userNameValue = driver.findElement(By.id("userName-value"));
        String actualText = userNameValue.getText();
        String expectedText = "test";

        if (actualText.equals(expectedText))
            System.out.println("Pass.");
        else
            System.out.println("Fail.");


        driver.close();
    }
}
