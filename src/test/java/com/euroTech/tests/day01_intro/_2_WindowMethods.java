package com.euroTech.tests.day01_intro;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _2_WindowMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/");

        //pencereyi büyükmek için
     //   driver.manage().window().maximize();
    //    Thread.sleep(2000);
     //   driver.manage().window().fullscreen();


        //pencerenin koordinatını alalım
        Point position = driver.manage().window().getPosition();
        System.out.println("position = " + position);

        //pencereyi diğer ekrana alalım
        driver.manage().window().setPosition(new Point(-1000,0));

        driver.manage().window().maximize();

        //pencere ebatlarını alalım
        int width = driver.manage().window().getSize().width;
        int height = driver.manage().window().getSize().height;
        System.out.println("width = " + width);
        System.out.println("height = " + height);

        Dimension size = driver.manage().window().getSize();
        System.out.println("size = " + size);

        //pencerenin ebatlarını belirleyelim.
        driver.manage().window().setSize(new Dimension(100,500));

        Thread.sleep(2000);
        driver.close();
    }
}
