package com.practise.email;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailPage {

    private WebDriver driver;

    public EmailPage(WebDriver webDriver){
        this.driver = webDriver;
    }

    public void toLoginPage(){
        driver.get("https://mail.163.com/");
    }

    public void loginEmailAndPwd(String email,String pwd){
        // 将driver移交到iframe
        driver.switchTo().frame(0);
        // 显式等待
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("email")));
        driver.findElement(By.name("email")).sendKeys(email);
        driver.findElement(By.name("password")).sendKeys(pwd);
    }

    public void clickLoignBtn(){
        driver.findElement(By.id("dologin")).click();
    }

    public void toRegistPage(){
        driver.get("https://mail.163.com/register/index.htm?from=163mail");
    }

    public void registEmailAndPwd(String email,String pwd,String phone){
        // 显式等待
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        driver.findElement(By.id("username")).sendKeys(email);
        driver.findElement(By.id("password")).sendKeys(pwd);
        driver.findElement(By.id("phone")).sendKeys(phone);
    }

    public void clickRegistBtn() throws InterruptedException {
        // 点击同意协议
        //driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]")).click();
        WebElement service = driver.findElement(By.id("service"));
        Actions actions = new Actions(driver);
        actions.click(service);

        Thread.sleep(3000);
        driver.findElement(By.id("service")).click();

        Thread.sleep(3000);
        driver.findElement(By.className("j-register")).click();

    }

}
