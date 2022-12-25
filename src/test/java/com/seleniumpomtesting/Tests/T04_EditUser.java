package com.seleniumpomtesting.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.seleniumpomtesting.Objects.EditPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T04_EditUser {
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
    public void EditUserName() throws InterruptedException{
        EditPage editPage = new EditPage(driver);
        editPage.acceptCookies();
        editPage.loginIn("loran7081@gmail.com","WPJWEu7M.EhbRT%");
        editPage.editUser("Samir");
        Thread.sleep(3000);
    }

    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
