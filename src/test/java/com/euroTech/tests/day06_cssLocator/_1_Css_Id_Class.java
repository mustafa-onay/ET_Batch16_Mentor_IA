package com.euroTech.tests.day06_cssLocator;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _1_Css_Id_Class {
    public static void main(String[] args) {
        /**
         * navigate to http://www.eurotech.study/
         * click cookies button with css id
         * click Sign Up button css class
         * send "Ahmet" to name box by css id with tag
         * click register button by css class with tag
         * close driver
         *--------------------
         * #id
         * tagName#id
         * -------------------
         * .className
         * tagName.className
         * Note: eğer class name'de boşluk varsa silinip yerine . (nokta) konulur.
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        WebDriverFactory.wait(2);

        WebElement cookies = driver.findElement(By.cssSelector("#rcc-confirm-button"));
        cookies.click();
        WebDriverFactory.wait(2);

        WebElement signUpBtn = driver.findElement(By.cssSelector(".btn.btn-primary"));
        signUpBtn.click();
        WebDriverFactory.wait(2);

        WebElement nameBox = driver.findElement(By.cssSelector("input#signuppage-form-name-input"));
        nameBox.sendKeys("Ahmet");
        WebDriverFactory.wait(2);

        WebElement registerBtn = driver.findElement(By.cssSelector("input.btn.btn-primary"));
        registerBtn.click();
        WebDriverFactory.wait(2);

        driver.close();
    }
}
