package com.primary.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class FindElementTest {

    WebDriver webDriver;

    @BeforeMethod
    public void openBrowser(){
        // 设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        // 打开浏览器
        webDriver = new ChromeDriver();
        // 跳转到百度页面
        webDriver.get("http://www.baidu.com");
    }

    @Test
    public void byIdTest(){
        WebElement su = webDriver.findElement(By.id("su"));
    }

    @Test
    public void byNameTest(){
        WebElement wd = webDriver.findElement(By.name("wd"));
    }

    @Test
    public void byClassNameTest(){
        webDriver.findElements(By.className("btn.self-btn.bg.s_btn"));
    }

    @Test
    public void byLinkTextTest(){
        WebElement wd = webDriver.findElement(By.linkText("新闻"));
        System.out.println(wd.getText());
    }

    @Test
    public void byPartialLinkTest(){
        WebElement wd = webDriver.findElement(By.partialLinkText("新"));
        System.out.println(wd.getText());
    }

    @Test
    public void byTagNameTest(){
        WebElement span = webDriver.findElement(By.tagName("a"));
        System.out.println(span.getText());
    }
    @Test
    public void byTagNameTest2(){
        List<WebElement> as = webDriver.findElements(By.tagName("a"));
        for (int i = 0; i < as.size(); i++) {
            System.out.println(as.get(i).getText());
        }
    }

    @Test
    public void byCssSelectorTest(){
        webDriver.findElement(By.cssSelector("#su"));
    }

    @Test
    public void byXPathTest(){
        webDriver.findElement(By.xpath("//*[@id=\"su\"]"));
    }

    @AfterMethod
    public void closedBrowser() throws InterruptedException {
        // 睡眠3秒
        Thread.sleep(3000);
        // 退出浏览器
        webDriver.quit();
    }

}
