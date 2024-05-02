package com.euroTech.tests.day13_actions_bileUpload_jsExecutor;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class _1_Actions {

    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    @AfterMethod
    public void tearDown() {
        WebDriverFactory.wait(3);
        //driver.close();
    }

    @Test
    public void hoverOver() {
        /**  CLASS TASK
         * navigate to https://testpages.herokuapp.com/styled/csspseudo/css-hover.html
         * hover over "Hover Para" element
         * get the text which is seen after hover action
         * and verify that the text is "You can see this paragraph now that you hovered on the above 'button'."
         * also verify that the text is displayed (use explicit wait)
         * hover over the "Hover Div" and verify that the text is not displayed anymore. (use explicit wait)
         */

        driver.get("https://testpages.herokuapp.com/styled/csspseudo/css-hover.html");


        WebElement hoverElement = driver.findElement(By.id("hoverpara"));

        //Actions actions = new Actions(driver);

        actions.moveToElement(hoverElement).perform();

        WebElement hoverMessage = driver.findElement(By.id("hoverparaeffect"));
        String actualText = hoverMessage.getText();
        String expectedText = "You can see this paragraph now that you hovered on the above 'button'.";

        Assert.assertEquals(actualText,expectedText);

        actions.moveToElement(hoverElement).perform();

        Assert.assertTrue(new WebDriverWait(driver,Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOf(hoverMessage)).isDisplayed());

        WebElement hoverdivpara = driver.findElement(By.id("hoverdivpara"));
        actions.moveToElement(hoverdivpara).perform();
        Assert.assertTrue(new WebDriverWait(driver,Duration.ofSeconds(4)).until(ExpectedConditions.invisibilityOf(hoverMessage)));
    }

    @Test
    public void hoverTask() {
        /**
         * go to https://the-internet.herokuapp.com/hovers
         * locate all users (image on the page) with findElements()
         * hover over all of them and verify that "name:user1-2-3" is displayed
         * if any time issues solve them with implicitly or explicitly waits
         */
    }

    @Test
    public void dragAndDrop() {
        /**  CLASS TASK
         * go to https://webdriveruniversity.com/Actions/index.html
         * take the "DRAG ME TO MY TARGET!" box and drop it "DROP HERE!" place
         * verify that "Dropped!" text is displayed..(make text correction at the same time)
         */

        driver.get("https://webdriveruniversity.com/Actions/index.html");

        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));

        actions.dragAndDrop(draggable,droppable).perform();  //Option 1

        //actions.moveToElement(draggable).clickAndHold().moveToElement(droppable).pause(2000).release().build().perform();
        // Option 2

        WebElement dropMessage = driver.findElement(By.cssSelector("#droppable>p>b"));
        String actualText = dropMessage.getText();
        String expectedText = "Dropped!";

        Assert.assertEquals(actualText,expectedText);
        Assert.assertTrue(dropMessage.isDisplayed());
    }

    @Test
    public void dragAndDrop_Task() {
        /**
         * go to https://demoqa.com/droppable
         * take "Drag me" and drop it "Drop here" section
         * verify that the "Dropped!" message is displayed (make text verification)
         */
        driver.get("https://demoqa.com/droppable");
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(draggable,droppable).perform();

        WebElement droppedText = driver.findElement(By.xpath("//p[text()='Dropped!']"));
        String actualText = droppedText.getText();
        String expectedText = "Dropped!";
        Assert.assertTrue(droppedText.isDisplayed());
        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void clickWithAction() {
        /**  CLASS TASK
         * navigate to https://skill-test.net/mouse-double-click
         * make double click to the Click box
         * make a normal click to the Click Box (not the middle of element)
         */

        driver.get("https://skill-test.net/mouse-double-click");

        WebElement clicker = driver.findElement(By.id("clicker"));

        //1. yol
        actions.doubleClick(clicker).perform();

        //2.yol
        actions.moveToElement(clicker).doubleClick().perform();

        //normal click
        actions.click(clicker).perform();

        //normal click tıklama yeri tarif ederek
        actions.moveToElement(clicker,5,6).click().perform();
    }

    @Test
    public void rightClick_Task() {
        /**  CLASS TASK
         * navigate to https://skill-test.net/right-click-test
         * make right click to the Start box and wait three seconds
         * make normal click on Reset box (use actions)
         */

        driver.get("https://skill-test.net/right-click-test");
        WebElement startButton = driver.findElement(By.id("clicker"));
        WebElement resetButton = driver.findElement(By.id("reset"));

        actions.contextClick(startButton).perform();
        actions.pause(Duration.ofSeconds(3)).perform();
        actions.click(resetButton).perform();


    }

    @Test
    public void fillingFormWithAction() {
        /**
         * go to http://www.eurotech.study/
         * accept cookies
         * click login
         * send your credentials to related boxes and then click login button
         * sgezer56@gmail.com
         * Sg12345678
         * click on Add Experience link
         * fill form with action class
         * verify the success message after submitted the form
         */

        driver.get("http://www.eurotech.study/");

        //accept cookies

        driver.findElement(By.xpath("//*[text()='I understand']")).click();

        WebElement loginBtn = driver.findElement(By.xpath("//a[text()='Login']"));
        loginBtn.click();

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        inputs.get(0).sendKeys("sgezer56@gmail.com");
        inputs.get(1).sendKeys("Sg12345678");
        inputs.get(2).click();

        WebElement addExperience = driver.findElement(By.linkText("Add Experience"));
        addExperience.click();

        WebElement jobTitle = driver.findElement(By.id("addexperience-jobtitle-input"));

        actions.click(jobTitle).sendKeys("QA Engineer" + Keys.TAB)
                .sendKeys("ABB" +Keys.TAB)
                .sendKeys("Baden" + Keys.TAB)
                .sendKeys("01012023" + Keys.TAB  + Keys.TAB)
                .sendKeys("12122023" + Keys.TAB)
                .sendKeys("Nice Job" + Keys.TAB + Keys.ENTER)
                .perform();

        WebElement successMessage = driver.findElement(By.cssSelector(".alert.alert-success"));
        String actualText = successMessage.getText();
        String expectedText = "Experience Added";

        Assert.assertEquals(actualText,expectedText);

    }

    @Test
    public void fillingForm_Task() {
        /**  CLASS TASK
         * go to https://www.krafttechexlab.com/login
         * send your credentials to related boxes and then click login button
         * click my profile
         * click on Add Experience link
         * fill form with action class
         * verify the success message after submitted the form
         */



    }
}
