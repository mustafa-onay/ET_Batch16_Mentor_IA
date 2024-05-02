package com.euroTech.tests.day12_waits;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class _1_Waits {

    /**
     * Wait Task
     * navigate to https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html
     * locate all buttons to a web element list (start, one, two, three) (findElements)
     * Let's click the buttons respectively
     * after the click to  the last button : "All Buttons Clicked" message should be seen at the page.
     * Note: Do not use Thread.sleep(), just use dynamic waits
     *
     *  https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html sayfasına gidelim
     *  bütün butonları bir list'e alalım (start, one, two, three) (findElements)
     *  butonlara sırasıyla tıklayalım
     *  son butona tıklandıktan sonra "All Buttons Clicked" mesajının ekrana geldiğini text ile doğrulayalım.
     *  Not: Thread.sleep() metodunu kullanmayalım sadece dinamik yani akıllı wait kullanalım...
     */
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        WebDriverFactory.wait(3);
        driver.close();
    }

    @Test
    public void testName() {
        driver.get("https://testpages.herokuapp.com/styled/dynamic-buttons-disabled.html");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.numberOfElementsToBe(By.tagName("button"),4));

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("buttons.size() = " + buttons.size());

        for (WebElement button : buttons){
            wait.until(ExpectedConditions.elementToBeClickable(button)).click();
        }

        WebElement messeageElement = driver.findElement(By.id("buttonmessage"));

        String actualMessage = messeageElement.getText();

        String expectedMessegae = "All Buttons Clicked";

        Assert.assertEquals(actualMessage,expectedMessegae);
    }
}
