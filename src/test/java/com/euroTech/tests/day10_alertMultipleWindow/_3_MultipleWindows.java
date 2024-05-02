package com.euroTech.tests.day10_alertMultipleWindow;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class _3_MultipleWindows {

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
    public void multipleWindow() {
        /**   CLASS TASK
         *navigate to "https://testpages.herokuapp.com/styled/windows-test.html"
         * click Basic Ajax in new page
         * switch to new opened page
         * verify that the page title is "Test Page For Basic Ajax Example"
         * verify that the new page's url is different
         */

        driver.get("https://testpages.herokuapp.com/styled/windows-test.html");

        WebElement basicAjaxInNewPage = driver.findElement(By.linkText("Basic Ajax in new page"));
        basicAjaxInNewPage.click();

        String currentWindow = driver.getWindowHandle();
        Set<String> allWindows = driver.getWindowHandles();

        System.out.println("currentWindow = " + currentWindow);
        System.out.println("allWindows = " + allWindows);

        for (String handle : allWindows){
            if (!handle.equals(currentWindow)){
                driver.switchTo().window(handle);
                break;
            }
        }

        String actualTitle = driver.getTitle();
        String expectedTitle = "Test Page For Basic Ajax Example";

        Assert.assertEquals(actualTitle,expectedTitle);

        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://testpages.herokuapp.com/styled/windows-test.html";

        Assert.assertNotEquals(expectedUrl, actualUrl);

    }

    @Test
    public void multipleWindow_2() {
        /**  CLASS TASK
         *navigate to "https://testpages.herokuapp.com/styled/windows-test.html"
         * click all three links
         * switch to the page whose title is "Test Page For Element Attributes"
         * verify that the page title
         * verify that the new page's url is different
         */

        String url = "https://testpages.herokuapp.com/styled/windows-test.html";
        driver.get(url);

        WebElement basicAjaxInNewPage = driver.findElement(By.linkText("Basic Ajax in new page"));
        basicAjaxInNewPage.click();
        WebDriverFactory.wait(2);
        WebElement attributesInNewPage = driver.findElement(By.linkText("Attributes in new page"));
        attributesInNewPage.click();
        WebDriverFactory.wait(2);
        WebElement alertsInNew = driver.findElement(By.linkText("Alerts In A New Window From JavaScript"));
        alertsInNew.click();
        WebDriverFactory.wait(2);

        Set<String> allTabs = driver.getWindowHandles();
        System.out.println("allTabs = " + allTabs);

        String targetTitle = "Test Page For Element Attributes";

        for (String handle : allTabs){
            driver.switchTo().window(handle);
            if (driver.getTitle().equals(targetTitle)){
                break;
            }
        }

        WebDriverFactory.wait(2);
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, targetTitle);

        String currentURL = driver.getCurrentUrl();

        Assert.assertFalse(currentURL.equals(url));
    }

    @Test
    public void multipleWindowTask() {
        /**
         * https://the-internet.herokuapp.com/windows sayfasını açın
         * "Click Here" linkine tıklayın
         * yeni açılan pencereye geçin
         * yeni açılan sayfada "New Window" başlığının olduğunu doğrulayın.
         * yeni açılan pencerenin title ve url'sini alıp yazdırın. (isterseniz bunları kullanarak verification yapabilirsiniz)
         */


    }
}
