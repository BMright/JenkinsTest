package com.primary.test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserActionsTest {

    private WebDriver webDriver;

    @BeforeMethod
    public void openChrome(){
        // 设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        // 打开浏览器
        webDriver = new ChromeDriver();
    }

    /**
     * 打开谷歌浏览器
     * 打开百度首页
     * 等待5秒
     * 关闭浏览器
     */
    @Test
    public void openBaiDu() throws InterruptedException {
        // 打开百度首页
        webDriver.get("https://www.baidu.com");
        //WebElement kw = webDriver.findElement(By.id("kw"));
    }

    @Test
    public void BackTest() throws InterruptedException {
        // 打开百度首页
        webDriver.get("https://www.baidu.com");
        // 睡眠3秒
        Thread.sleep(3000);
        // 后退
        webDriver.navigate().back();
    }

    @Test
    public void ForwardTest() throws InterruptedException {
        // 打开百度首页
        webDriver.get("https://www.baidu.com");
        // 睡眠3秒
        Thread.sleep(3000);
        // 后退
        webDriver.navigate().back();
        // 睡眠3秒
        Thread.sleep(3000);
        // 前进
        webDriver.navigate().forward();
    }

    @Test
    public void RefreshTest() throws InterruptedException {
        // 打开百度首页
        webDriver.get("https://www.baidu.com");
        // 睡眠3秒
        Thread.sleep(3000);
        // 刷新
        webDriver.navigate().refresh();
    }

    @Test
    public void SetDimensionSizeTest() throws InterruptedException {
        // 打开百度首页
        webDriver.get("https://www.baidu.com");
        // 睡眠3秒
        Thread.sleep(3000);
        // 改变窗口大小
        Dimension dimension = new Dimension(900,600);
        webDriver.manage().window().setSize(dimension);
        // 睡眠3秒
        Thread.sleep(3000);
        // 最大化窗口
        webDriver.manage().window().maximize();
    }

    @Test
    public void GetCurrentURLTest() throws InterruptedException {
        // 打开百度首页
        webDriver.get("https://www.baidu.com");
        // 睡眠3秒
        Thread.sleep(3000);
        // 得到当前窗口URL
        String url = webDriver.getCurrentUrl();
        System.out.println("当前窗口url为：" + url);
    }

    @Test
    public void GetCurrentTitleTest() throws InterruptedException {
        // 打开百度首页
        webDriver.get("https://www.baidu.com");
        // 睡眠3秒
        Thread.sleep(3000);
        // 得到当前窗口URL
        String title = webDriver.getTitle();
        System.out.println("当前窗口title为：" + title);
    }

    @AfterMethod
    public void closedChrome() throws InterruptedException {
        // 睡眠3秒
        Thread.sleep(3000);
        // 退出浏览器
        webDriver.quit();
    }

}
