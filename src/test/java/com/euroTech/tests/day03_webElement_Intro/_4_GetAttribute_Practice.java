package com.euroTech.tests.day03_webElement_Intro;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _4_GetAttribute_Practice {

    public static void main(String[] args) {


        /**
         * Task
         * open chrome browser
         * go to http://www.eurotech.study/
         * click "I understand" button and accept cookies
         * take the value of the attributes (class and href) of the login button and print the values.
         * click login button
         * send "sdfsdsd" into email address input box
         * click Login button
         * get the message which appears on the email input box
         * VERIFY that the message contains "Please include an '@' in the email address."
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        //accept cookies
        driver.findElement(By.id("rcc-confirm-button")).click();

        //login button
        WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
        System.out.println(loginBtn.getAttribute("class"));
        System.out.println(loginBtn.getAttribute("href"));

        loginBtn.click();

        WebElement emailBox = driver.findElement(By.id("loginpage-input-email"));
        emailBox.sendKeys("sdfsdsd");

        WebElement secondLoginBtn = driver.findElement(By.id("loginpage-form-btn"));
        secondLoginBtn.click();

        //get the warning message
        String validationMessage = emailBox.getAttribute("validationMessage");
        String expectedMessage = "Please include an '@' in the email address.";
        System.out.println(validationMessage);

        if (validationMessage.contains(expectedMessage))
            System.out.println("Pass");
        else
            System.out.println("Fail");

        WebDriverFactory.wait(1);
        driver.close();

    }

}
