package com.euroTech.tests.day07_testNG_Intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _3_TestNG_AssertionsDemo {

    @Test
    public void test1(){
        Assert.assertEquals("a","a","TC-001 Login Test");
        Assert.assertTrue(10<11,"TC 002 Login Test");
        Assert.assertNotEquals("a","b","TC 003 Login Test");
        Assert.assertFalse(1>5,"TC 004 Login Test");
        Assert.assertNotNull(55,"TC 005 Login Test");
        Assert.assertNull(null,"TC 006 Login Test");

        Assert.assertTrue("actual".contains("actual"),"TC 007 Login Test");


    }
}
