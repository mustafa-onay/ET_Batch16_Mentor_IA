package com.euroTech.tests.day07_testNG_Intro;

import org.testng.annotations.*;

public class _2_BeforeAfterMethod {

    @Test (priority = 3)
    public void test1(){
        System.out.println("test1");
    }

    @Test (priority = -1)
    //@Ignore
    public void test2() {
        System.out.println("test2");
    }

    @Test (priority = 2)
    //(enabled = false)
    public void test3(){
        System.out.println("test1");
    }

    @Test (priority = 0)
    public void test4() {
        System.out.println("test2");
    }

    @BeforeMethod
    public void setUp(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("After Method");
    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("After Class");
    }
}
