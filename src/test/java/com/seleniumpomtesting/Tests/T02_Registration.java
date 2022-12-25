package com.seleniumpomtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.seleniumpomtesting.Objects.RegistrationPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T02_Registration {
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
    public void registrationOperation() throws InterruptedException{
        RegistrationPage registration = new RegistrationPage(driver);
        Thread.sleep(5000); 
        registration.acceptCookies();
        Thread.sleep(5000); 
        registration.register("Mr","Loran", "Baker","31/01/1999","1","loran.baker@readydev.tech", "Loran12345!","Loran12345!");
        Thread.sleep(10000);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
