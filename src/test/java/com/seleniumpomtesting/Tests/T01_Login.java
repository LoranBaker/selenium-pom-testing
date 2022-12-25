package com.seleniumpomtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumpomtesting.Objects.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T01_Login {
    WebDriver driver;
    String url = "https://store.liverpoolfc.com/";

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(url);    
    }

    @Test
    public void LoginOperation() throws InterruptedException{
        LoginPage loginHomepage = new LoginPage(driver);
        loginHomepage.acceptCookies();
        loginHomepage.loginIn("loran7081@gmail.com","WPJWEu7M.EhbRT%");
        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
