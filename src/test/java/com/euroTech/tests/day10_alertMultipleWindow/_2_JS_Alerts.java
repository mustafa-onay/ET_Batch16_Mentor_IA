package com.euroTech.tests.day10_alertMultipleWindow;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _2_JS_Alerts {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        //WebDriverFactory.wait(3);
        //driver.close();
    }

    @Test
    public void jsAlert_Accept(){
        /**
         * navigate to https://the-internet.herokuapp.com/javascript_alerts
         * click on click For Js Alert button
         * create an alert object
         * take text on the alert button and print it
         * click on OK button by using alert object
         * verify that "You successfully clicked an alert" text is seen
         */

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        alertBtn.click();

        Alert alert = driver.switchTo().alert();

        System.out.println("alert.getText() = " + alert.getText());

        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        String actualText = result.getText();
        String expectedText = "You successfully clicked an alert";

        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void jsAlert_SendKeys(){
        /**
         * navigate to https://the-internet.herokuapp.com/javascript_alerts
         * click on click  JS Prompt button
         * create an alert object
         * take text on the alert button and print it
         * send "Ahmet Ay" text to the bar which is on the alert
         * click on OK button by using alert object
         * verify that "You entered: Ahmet Ay" text is seen and verify the correction
         */

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        WebElement alertBtn = driver.findElement(By.xpath("//button[text()='Click for JS Promt']"));
        alertBtn.click();

        WebDriverFactory.wait(2);

        Alert alert = driver.switchTo().alert();

        alert.dismiss();

        alert.accept();

        WebDriverFactory.wait(2);

        System.out.println("alert.getText() = " + alert.getText());

        alert.sendKeys("Ahmet Ay");

        alert.accept();

        WebElement result = driver.findElement(By.id("result"));
        String actualText = result.getText();
        String expectedText = "You entered: Ahmet Ay";

        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void jsAlert_Task() {
        /**   CLASS TASK
         * navigate to https://testpages.herokuapp.com/styled/alerts/alert-test.html
         * click alert box
         * then take message on the js popup and print it
         * accept alert
         *
         * click show confirm box
         * then take message on the js popup and print it
         * dismiss alert
         * verify that you clicked cancel button (Alınan mesajın Cancel içerdiğini doğrula)
         *
         * click show prompt box
         * then take message on the js popup and print it
         * send Ahmet to the popup box
         * accept alert
         * verify that Ahmet is sent to the box.
         *
         * NOT: tüm taskı tek test metodunda yapabilirsiniz..
         */
    }
}
