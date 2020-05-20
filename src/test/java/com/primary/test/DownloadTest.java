package com.primary.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DownloadTest {

    WebDriver webDriver;

    @BeforeMethod
    public void openChrome(){
        // 设置chromedriver路径
        System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        //创建无Chrome无头参数
        ChromeOptions chromeOptions=new ChromeOptions();
        chromeOptions.addArguments("-headless");
        // 打开浏览器
        webDriver = new ChromeDriver(chromeOptions);
    }

    //@AfterMethod
    public void closedChrome() throws InterruptedException {
        // 睡眠3秒
        Thread.sleep(3000);
        // 退出浏览器
        webDriver.quit();
    }

    @Test
    public void optionsTest(){
        webDriver.get("http://www.baidu.com");
        String title = webDriver.getTitle();
        System.out.println(title);
    }

    @Test
    public void downloadTest() throws InterruptedException {
        // 跳转到下载页
        webDriver.get("https://dl.pconline.com.cn/html_2/1/117/id=10699&pn=0&linkPage=1.html");
        // 定位到下载链接
        webDriver.findElement(By.xpath("//*[@id=\"local_1\"]/a[1]")).click();
        // 创建Chrome浏览器配置对象实例
        //ChromeOptions options = new ChromeOptions();
//        Actions actions = new Actions(webDriver);
//        System.out.println(text);
//        actions.click(webDriver.findElement(By.linkText(text)));
        Thread.sleep(10000);
    }

}
