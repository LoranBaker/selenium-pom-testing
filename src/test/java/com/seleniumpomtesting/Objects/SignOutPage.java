package com.seleniumpomtesting.Objects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignOutPage {

    WebDriver driver;

    public SignOutPage(WebDriver _driver){
        this.driver = _driver;
    }
    
    By signoutButton = By.className("customer-name");
    By signoutBtn = By.cssSelector("#html-body > div.page-wrapper > header > div > div > div.header__header-right > div.panel.wrapper > div > ul > li > div > ul > li.link.authorization-link > a");

    public void signOut(){
        try{
            driver.findElement(signoutButton).click();
            Thread.sleep(5000);
            driver.findElement(signoutBtn).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
