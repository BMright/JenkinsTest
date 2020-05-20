package com.primary.test;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGCase1 {

    @BeforeTest
    public void beforeTestCase(){
        System.out.println("我是@BeforeTest测试，测试前你只会看见我一次");
    }

    @BeforeMethod
    public void beforeMethodCase(){
        System.out.println("我是@BeforeMethod测试，测试前你可能会看见我一次或多次");
    }

    @Test
    public void testCase3(){
        String a = null;
        Assert.assertNotNull(a,"字符串a为null校验");
    }

    @Test
    public void testCase2(){
        String a = "1234";
        String b = "5678";
        Assert.assertNotEquals(a,b,"a和b相等校验");
    }

    @Test
    public void testCase1(){
        System.out.println("我是@Test测试，这是第一个test测试");
    }

    @AfterMethod
    public void afterMethodCase(){
        System.out.println("我是@AfterMetthod测试，测试后你可能会看见我一次或多次");
    }

    @AfterTest
    public void afterTestCase(){
        System.out.println("我是@AfterTest测试，测试后你只会看见我一次");
    }

}
