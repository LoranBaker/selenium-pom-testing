package com.seleniumpomtesting.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddItemToCartPage {
    WebDriver driver;

    public AddItemToCartPage(WebDriver _driver){
        this.driver = _driver;
    }

    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By shopNowBtn = By.cssSelector("#dy-hero-slide-2 > div > div > div > a");
    By itemSelect = By.cssSelector("#kuResults > ul > li:nth-child(1)");
    By choseSizeItem = By.cssSelector("#option-label-size-205-item-217");
    By addItemToCart = By.cssSelector("#product-addtocart-button");
    //iframe[@title="reCAPTCHA"]

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void addItemToCart(){
        try{
            driver.findElement(shopNowBtn).click();
            driver.findElement(itemSelect).click();
            driver.findElement(choseSizeItem).click();
            driver.findElement(addItemToCart).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
