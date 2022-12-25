package com.seleniumpomtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumpomtesting.Objects.FilterInLivingPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T08_SortingBySizeItem {
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
    public void sortItemsBySize() throws InterruptedException{
        FilterInLivingPage filterPage = new FilterInLivingPage(driver);
        filterPage.acceptCookies();
        Thread.sleep(3000);
        filterPage.sortItemsBySize();
        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
