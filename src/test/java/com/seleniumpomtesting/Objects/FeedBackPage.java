package com.seleniumpomtesting.Objects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.seleniumpomtesting.helpers.WebdriverUtils;


public class FeedBackPage {
    WebDriver driver;

    public FeedBackPage(WebDriver _driver){
        this.driver = _driver;
    }
    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By feedbackHomeBtn = By.id("nebula_div_btn");
    By frame = By.cssSelector("iframe[id*='kampyleForm']");
    By label = By.xpath("//label[contains(@class,'rating-label')][contains(.,'8')]");
    By submitBtn = By.cssSelector(".panel-footer-web .submit-btn");
    By closeBtn = By.cssSelector("button[aria-label='Close Survey']");
   

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void feedbackFuncionality(){
        try{
            driver.findElement(feedbackHomeBtn).click();
            driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[id*='kampyleForm']")));
            WebdriverUtils.clickVisible(driver,By.xpath("//label[contains(@class,'rating-label')][contains(.,'6')]"),Duration.ofSeconds(5));
            WebdriverUtils.clickVisible(driver,By.cssSelector(".panel-footer-web .submit-btn"),Duration.ofSeconds(5));
            driver.findElement(closeBtn).click();
            driver.switchTo().defaultContent();

        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

   
}

