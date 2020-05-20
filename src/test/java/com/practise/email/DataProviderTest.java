package com.practise.email;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {

    WebDriver webDriver;

    @DataProvider(name = "user")
    public Object[][] dataTest(){
        return new Object[][]{
                {"test123456","123456"},
                {"test111111","123456"}
        };
    }
    @Test(dataProvider = "user")
    public void loginCase(String usrname,String pwd){
        // 实例化页面对象
        EmailPage emailPage = new EmailPage(webDriver);
        System.out.println("我是用户" + usrname);
        // 跳转到登录页面
        emailPage.toLoginPage();
        // 输入邮箱及密码
        emailPage.loginEmailAndPwd(usrname,pwd);
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
