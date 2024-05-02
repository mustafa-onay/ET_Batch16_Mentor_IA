package com.euroTech.tests.day10_alertMultipleWindow;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _1_HTML_PopUps {

    /**  CLASS TASK
     * navigate to https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html
     * click show alert box
     * verify that ok button can be seen on the popup
     * take the text on popup and print it (I am a fake alert box!)
     * then click on ok at the popup
     * verify that ok button cannot be seen
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
    public void htmlPopup() {
        driver.get("https://testpages.herokuapp.com/styled/alerts/fake-alert-test.html");

        WebElement fakeAlert = driver.findElement(By.id("fakealert"));
        WebDriverFactory.wait(2);
        fakeAlert.click();
        WebDriverFactory.wait(2);

        WebElement okBtn = driver.findElement(By.id("dialog-ok"));
        Assert.assertTrue(okBtn.isDisplayed());

        WebElement text = driver.findElement(By.cssSelector("#dialog-text"));
        System.out.println("text.getText() = " + text.getText());

        okBtn.click();

        Assert.assertFalse(okBtn.isDisplayed());
    }

    @Test
    public void htmlPopup_Task(){
        /**
         * go to http://primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=73437
         * click on confirm button
         * click on yes at the popup window
         * make verification with confirmed popup
         */
    }
}
