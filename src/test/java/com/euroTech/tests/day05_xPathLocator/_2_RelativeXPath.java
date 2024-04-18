package com.euroTech.tests.day05_xPathLocator;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2_RelativeXPath {
    public static void main(String[] args) {
        /**
         * class task
         * open chrome browser and go to http://www.eurotech.study/
         * click I understand button and accept cookies (by xPath with contains (attribute))
         * locate sign up by xPath with contains (text)
         * click Sign Up
         * locate Name input box by xPath (starts with) and send to box "Ahmet"
         * locate email input box by xPath (more than one attribute) and send the box "aaa@aaa.com"
         * locate password input box by xPath (more than one attribute with "and") and type in "123456"
         * locate confirm password input box by xPath (more than one attribute with "or") and type in "123456"
         * locate Sign In link by xPath (with index) --- use only tag
         * click Sign In link
         * close browser.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        //cookies
        driver.findElement(By.xpath("//button[contains(@aria-label,'cook')]")).click();
        WebDriverFactory.wait(2);

        //sign up
        WebElement signUpBtn = driver.findElement(By.xpath("//a[contains(text(),'Up')]"));
        signUpBtn.click();
        WebDriverFactory.wait(2);

        //name
        WebElement nameBox = driver.findElement(By.xpath("//input[starts-with(@name,'n')]"));
        nameBox.sendKeys("Ahmet");
        WebDriverFactory.wait(2);

        //email
        WebElement emailBox = driver.findElement(By.xpath("//input[@type='email'][@placeholder='Email Address']"));
        emailBox.sendKeys("aaa@aaa.com");
        WebDriverFactory.wait(2);

        //password
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password' and @name='password']"));
        passwordBox.sendKeys("123456");
        WebDriverFactory.wait(2);

        //password confirm
        WebElement confirmPasswordBox = driver.findElement(By.xpath("//input[@id='signuppage-form-pw2-input' or @name='password2']"));
        confirmPasswordBox.sendKeys("123456");
        WebDriverFactory.wait(2);

        //sign in link
        WebElement signInLink = driver.findElement(By.xpath("(//a)[2]"));
        signInLink.click();
        WebDriverFactory.wait(2);

        driver.close();


    }
}
