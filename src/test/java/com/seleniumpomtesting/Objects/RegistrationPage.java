package com.seleniumpomtesting.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {
    
    WebDriver driver;

    public RegistrationPage(WebDriver _driver){
        this.driver = _driver;
    }

    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By signIn = By.linkText("Sign In");
    By registerButton = By.linkText("Register for free");
    By Title = By.id("prefix");
    By Forename = By.name("firstname");
    By Surname = By.id("lastname");
    By DoB = By.id("dob");
    By dropdownGeneder = By.id("gender");

    By email = By.id("email_address");
    By password = By.id("password");
    By ConfirmPassword = By.id("password-confirmation");
    By CreateAccBtn = By.cssSelector("#form-validate > div > div.primary > button");

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
            driver.findElement(signIn).click();
            driver.findElement(registerButton).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void register(String title, String Forname, String surname, String doB,String value,
    String emailUser, String passwordUser, String confirmPassword){
        Select select = new Select(driver.findElement(dropdownGeneder));
        try{
            driver.findElement(Title).sendKeys(title);
            driver.findElement(Forename).sendKeys(Forname);
            driver.findElement(Surname).sendKeys(surname);
            driver.findElement(DoB).sendKeys(doB);
            select.selectByValue(value);
            driver.findElement(email).sendKeys(emailUser);
            driver.findElement(password).sendKeys(passwordUser);
            driver.findElement(ConfirmPassword).sendKeys(confirmPassword);
            driver.findElement(CreateAccBtn).click();    
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
