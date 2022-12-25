package com.seleniumpomtesting.Objects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ForgotPasswordPage {
    WebDriver driver;
  

    public ForgotPasswordPage(WebDriver _driver){
        this.driver = _driver;
    }

    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By signIn = By.linkText("Sign In");
    By forgotPasswordPageBtn = By.linkText("Forgot Your Password?");
    By inputEmail = By.cssSelector("#WholesaleContact > fieldset > table > tbody > tr:nth-child(1) > td > input[type=text]");
    By submitButton = By.xpath("//button[@name='submit']");

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
            driver.findElement(signIn).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void forgotPassword(String email){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try{
            driver.findElement(forgotPasswordPageBtn).click();
            driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
            driver.findElement(inputEmail).sendKeys(email);
            Thread.sleep(10000);
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[@title='reCAPTCHA']")));
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();;
            Thread.sleep(10000);
            driver.findElement(submitButton).click();
            Thread.sleep(10000);
            
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
