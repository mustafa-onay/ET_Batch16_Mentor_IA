package com.euroTech.tests.day09_listOfElements_dropDowns;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _3_DropDownWithoutSelectTag {



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
    public void dropDownWithoutSelect() {
        /**
         * navigate to https://demoqa.com/select-menu
         * locate and click Select Value dropdown
         * select (click) "Group 1, option 2" from Select Value dropdown
         * locate the new "Group 1, option 2" web element (stale element daha sonra anlatılacak)
         * verify that the element text is "Group 1, option 2"
         */

        WebDriverFactory.wait(2);

        driver.get("https://demoqa.com/select-menu");
        WebElement dropDownMenu = driver.findElement(By.xpath("//div[text()='Select Option']"));
        dropDownMenu.click();
        WebDriverFactory.wait(2);

        WebElement group1Option2 = driver.findElement(By.id("react-select-2-option-0-1"));
        group1Option2.click();
        WebDriverFactory.wait(2);

        WebElement group1Option2_2 = driver.findElement(By.xpath("//div[text()='Group 1, option 2']"));
        String selectedOption = group1Option2_2.getText();
        System.out.println("selectedOption = " + selectedOption);
    }

    @Test
    public void withoutSelect_Task() {
        /**   CLASS TASK
         * navigate to https://demo.aspnetawesome.com/
         * locate and click DropdownList (Mango ile başlayan liste)
         * get all option names and print them
         * click potato by index (6) and make verification
         * click again drop down list
         * click rice with its own locator (Rice'ı locate edip tıklayalım.)
         * then make verification
         */
    }
}
