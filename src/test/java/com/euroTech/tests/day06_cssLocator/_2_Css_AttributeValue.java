package com.euroTech.tests.day06_cssLocator;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class _2_Css_AttributeValue {
    public static void main(String[] args) {
        /**
         * navigate to http://www.eurotech.study/
         * click cookies button with one css attribute value
         * take DevEx text and print with css multiple attribute value (and)
         * take main text and print with css multiple attribute value (or)
         * close driver
         * --------------------
         * [attribute='value']
         * tagName[attribute='value']
         * ----------------------
         * birden çok attribute ile css'de locate etme:
         * [attribute1='value1'][attribute2='value2'] (and)
         * tagName[attribute1='value1'][attribute2='value2'] (and)
         *
         * [attribute1='value1'],[attribute2='value2'] (or)
         * tagName[attribute1='value1'],[attribute2='value2'] (or)
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://www.eurotech.study/");

        WebDriverFactory.wait(2);

        WebElement cookies = driver.findElement(By.cssSelector("[aria-label='Accept cookies']"));
        cookies.click();
        WebDriverFactory.wait(2);

        WebElement devExElement = driver.findElement(By.cssSelector("h1[class='x-large'][id='landingpage-innercontainer-h1']"));
        System.out.println(devExElement.getText());

        WebElement mainParagraph = driver.findElement(By.cssSelector("[id=\"landingpage-innercontainer-p\"],[class=\"lead\"]"));
        System.out.println(mainParagraph.getText());

        WebDriverFactory.wait(2);
        driver.close();
    }
}
