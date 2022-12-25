package com.seleniumpomtesting.helpers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtils {
    
 
    public static boolean clickVisible(WebDriver driver, By locator, Duration timeout) {
        try {
            Wait<WebDriver> wait = new WebDriverWait(driver, timeout);
            wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
            return true;
        } catch (Exception e) {
            System.out.println("Failed to click on element" + e.getMessage());
            return false;
        }
    }

    public static boolean clickVisible(WebDriver driver, By locator) {
        return clickVisible(driver, locator, Duration.ofSeconds(5));
    }
}
