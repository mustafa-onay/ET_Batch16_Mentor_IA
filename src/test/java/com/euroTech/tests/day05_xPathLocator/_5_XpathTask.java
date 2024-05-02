package com.euroTech.tests.day05_xPathLocator;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _5_XpathTask {

    static WebDriver driver;
    public static void main(String[] args) {
        /**
         * open a chrome browser
         * navigate to http://opencart.abstracta.us/index.php?route=common/home
         * locate "iPhone Add to Cart Button" with the name of product iPhone
         * then click to the add to cart button
         * take the text of success message which appears after the click
         * verify that the message contains "Success"
         * close driver
         */

        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://opencart.abstracta.us/index.php?route=common/home");

        addToCart("iPhone");
        WebDriverFactory.wait(4);

        WebElement successMessageElement = driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible"));
        String actualText = successMessageElement.getText();

        if (actualText.contains("Success")){
            System.out.println("Pass");
        }else
            System.out.println("Failed");

        WebDriverFactory.wait(2);

        driver.close();
    }


    public static void addToCart(String productName){
        driver.findElement(By.xpath("//a[text()=MacBook]/../../following-sibling::div/button[.//span]")).click();
    }
}
