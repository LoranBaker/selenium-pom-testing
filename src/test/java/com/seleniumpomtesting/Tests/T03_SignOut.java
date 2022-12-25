package com.seleniumpomtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumpomtesting.Objects.LoginPage;
import com.seleniumpomtesting.Objects.SignOutPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T03_SignOut {
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
    public void SignOutOperation() throws InterruptedException{
        LoginPage loginHomepage = new LoginPage(driver);
        SignOutPage signOutPage = new SignOutPage(driver);
        loginHomepage.acceptCookies();
        loginHomepage.loginIn("loran7081@gmail.com","WPJWEu7M.EhbRT%");
        Thread.sleep(10000);
        signOutPage.signOut();
        Thread.sleep(10000);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    } 
}
