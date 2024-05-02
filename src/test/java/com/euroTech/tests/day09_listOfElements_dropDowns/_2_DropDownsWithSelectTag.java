package com.euroTech.tests.day09_listOfElements_dropDowns;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class _2_DropDownsWithSelectTag {
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
    public void dropDownsWithSelectTag() {
        /**
         * Select Menu
         * go to https://demoqa.com/select-menu
         * locate Old Style Select Menu (dropdown menu)
         * get all colorsOptions(web elements) as a list
         * verify that the number of webElement is 11
         * click (select) green
         * verify that the selected option's text is 'Green'
         */

        driver.get("https://demoqa.com/select-menu");

        WebElement dropDownElement = driver.findElement(By.id("oldSelectMenu"));

        Select select = new Select(dropDownElement);

        // bütün opsiyonlari bir liste alalim
        List<WebElement> options = select.getOptions();
        Assert.assertEquals(options.size(),11);

        //green'i secelim
        options.get(2).click();
        WebDriverFactory.wait(2);

        //listeden secelim
        select.selectByVisibleText("Purple");
        WebDriverFactory.wait(2);
        select.selectByIndex(0);
        WebDriverFactory.wait(2);
        select.selectByValue("10");
        WebDriverFactory.wait(2);

        select.selectByVisibleText("Green");

        WebElement firstSelectedOption = select.getFirstSelectedOption();
        String actualText = firstSelectedOption.getText();
        String expectedText = "Green";

        Assert.assertEquals(actualText,expectedText);
    }

    @Test
    public void withSelectTag() {
        /**
         * navigate to https://www.amazon.com/"
         * locate the dropdown menu nearby the search box
         * select the Baby department by using text then print the department name
         * select the Books department by using index then print the department name
         * select the Health & Household department by using value attribute then print the department name
         * get all options to a list
         * print all departments name
         * get the text of fifth element and verify that the text is Books
         */
        
    }
}
