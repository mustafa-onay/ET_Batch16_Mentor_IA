package com.euroTech.tests.day01_intro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_Intro {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com");

        driver.close();


    }
}
