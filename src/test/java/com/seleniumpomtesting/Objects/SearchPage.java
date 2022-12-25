package com.seleniumpomtesting.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class SearchPage {
     
    WebDriver driver;

    public SearchPage(WebDriver _driver){
        this.driver = _driver;
    }

    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By searchElement = By.id("search");

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void searchItem(String searchString){
        try{
            driver.findElement(searchElement).sendKeys(searchString);
            driver.findElement(searchElement).sendKeys(Keys.ENTER);
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
