package com.euroTech.selfLearning.Repeat_Day_03;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_2_Verify_Url_Is_Changed {

    /**
     *
     * open chrome browser
     * go to "https://demoqa.com/login"
     * enter "test" into the username box
     * VERIFY that "test" is displayed in the username box
     * enter "Test.!123" into the password box
     * click on login button
     * VERIFY that username is "test"
     */

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/login");

        WebElement inputUserName = driver.findElement(By.cssSelector("#userName"));
        inputUserName.sendKeys("test");

        String actualUserName = inputUserName.getAttribute("value");

        if (actualUserName.equals("test")){
            System.out.println("Username is correct");
        }else
            System.out.println("Username is don't correct");

        WebElement inputPassword = driver.findElement(By.cssSelector("#password"));
        inputPassword.sendKeys("Test.!123");

        WebDriverFactory.wait(2);

        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();

        
    }

}
