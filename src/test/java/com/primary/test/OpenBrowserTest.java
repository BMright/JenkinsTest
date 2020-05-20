package com.primary.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class OpenBrowserTest {

    @Test
    public void openChrome(){
        System.setProperty("webdriver.chrome.driver","E:\\IDEA\\study\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
    }

    @Test
    public void openIE(){
        System.setProperty("webdriver.ie.driver","./drivers/IEDriverServer.exe");
        WebDriver webDriver = new InternetExplorerDriver();
    }

    @Test
    public void openEdge(){
        System.setProperty("webdriver.edge.driver","./drivers/MicrosoftWebDriver.exe");
        WebDriver webDriver = new EdgeDriver();
    }

}
