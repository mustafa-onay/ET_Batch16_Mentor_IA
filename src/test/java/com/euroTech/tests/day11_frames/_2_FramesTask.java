package com.euroTech.tests.day11_frames;

import com.euroTech.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _2_FramesTask {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        WebDriverFactory.wait(3);
        //driver.close();
    }

    @Test
    public void task1() {
        /**
         * navigate to https://the-internet.herokuapp.com/iframe
         * get te text of heading "An iFrame containing the TinyMCE WYSIWYG Editor" and print it
         * Firstly clear the text area  which contains "Your content goes here."
         * And send a new text to the area : "Hello World!"
         * get te text of heading "An iFrame containing the TinyMCE WYSIWYG Editor" and print it again.
         *
         */

    }

    @Test
    public void task2() {
        /**
         * go to https://the-internet.herokuapp.com/nested_frames
         * verify that the MIDDLE text is seen  -- by name
         * verify that the RIGHT text is seen   -- by index
         * verify that the BOTTOM text is seen  --by index
         * NOT: belirtilmeyen geçişlerde istediğiniz yöntemi kullanabilirsiniz..
         * Framelerde bulunan textler yazdırılacaktır...
         */
    }
}
