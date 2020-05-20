package com.practise.email;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Email_Po {

    WebDriver webDriver;

    @Test
    public void registCase() throws InterruptedException {
        // 实例化页面对象
        EmailPage emailPage = new EmailPage(webDriver);
        // 跳转到注册页面
        emailPage.toRegistPage();
        // 获取当前时间戳
        String s = String.valueOf(System.currentTimeMillis()/100);
        // 输入邮箱、密码及手机号
        emailPage.registEmailAndPwd("tt1tt2tt3456","test123456",s);
        // 点击注册按钮
        emailPage.clickRegistBtn();
    }

    @Test
    public void loginCase(){
        // 实例化页面对象
        EmailPage emailPage = new EmailPage(webDriver);
        // 跳转到登录页面
        emailPage.toLoginPage();
        // 输入邮箱及密码
        emailPage.loginEmailAndPwd("test123456","123456");
        // 点击登录按钮
        emailPage.clickLoignBtn();
    }

    @BeforeMethod
    public void openChrome(){
        // 设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //创建无Chrome无头参数
//        ChromeOptions chromeOptions=new ChromeOptions();
//        chromeOptions.addArguments("-headless");
        // 打开浏览器
        webDriver = new ChromeDriver();
    }

    @AfterMethod
    public void closedChrome() throws InterruptedException {
        // 睡眠3秒
        Thread.sleep(3000);
        // 退出浏览器
        webDriver.quit();
    }

}
