package com.primary.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class ClosedBrowserTest {

    @Test
    public void ClosedIE1() throws InterruptedException {
        System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
        WebDriver webDriver = new InternetExplorerDriver();
        // 睡眠5秒
        Thread.sleep(5000);
        // 关闭当前窗口
        webDriver.close();
    }

    @Test
    public void ClosedIE2() throws InterruptedException {
        System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
        WebDriver webDriver = new InternetExplorerDriver();
        // 睡眠5秒
        Thread.sleep(5000);
        // 完全退出浏览器
        webDriver.quit();
    }

}
