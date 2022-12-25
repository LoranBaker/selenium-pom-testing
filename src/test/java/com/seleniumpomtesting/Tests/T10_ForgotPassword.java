package com.seleniumpomtesting.Tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumpomtesting.Objects.ForgotPasswordPage;

import io.github.bonigarcia.wdm.WebDriverManager;



public class T10_ForgotPassword {
    WebDriver driver;
    WebDriverWait wait;
    String url = "https://store.liverpoolfc.com/";

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);    
    }

    @Test
    public void ForgotPassword() {
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(driver);
        try {
            Thread.sleep(3000);
            forgotPasswordPage.acceptCookies();
            forgotPasswordPage.forgotPassword("frale132@gmail.com");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
