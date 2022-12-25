package com.seleniumpomtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumpomtesting.Objects.FeedBackPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T09_Feedback {
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
    public void sortItemsBySize() {
        FeedBackPage feedBackPage = new FeedBackPage(driver);
        try {
            feedBackPage.acceptCookies();
            Thread.sleep(5000);
            feedBackPage.feedbackFuncionality();
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
