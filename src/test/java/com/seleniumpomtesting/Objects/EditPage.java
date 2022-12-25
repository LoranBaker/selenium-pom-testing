package com.seleniumpomtesting.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EditPage {
    WebDriver driver;

    public EditPage(WebDriver _driver){
        this.driver = _driver;
    }

    By email = By.name("login[username]");
    By password = By.name("login[password]");
    By loginButton = By.id("send2");
    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By signIn = By.linkText("Sign In");
    By editBtn = By.linkText("Edit");
    By editFirstName = By.id("firstname");
    By saveBtn = By.xpath("//*[@id='form-validate']/div/div[1]/button");

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
            driver.findElement(signIn).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void loginIn(String emailUser, String passwordUser){
        try{
            driver.findElement(email).sendKeys(emailUser);
            driver.findElement(password).sendKeys(passwordUser);
            driver.findElement(loginButton).click();    
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void editUser(String name){
        try{
            driver.findElement(editBtn).click();
            driver.findElement(editFirstName).clear();    
            driver.findElement(editFirstName).sendKeys(name);
            driver.findElement(saveBtn).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
