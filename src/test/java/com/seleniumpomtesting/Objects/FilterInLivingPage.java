package com.seleniumpomtesting.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FilterInLivingPage {
    WebDriver driver;

    public FilterInLivingPage(WebDriver _driver){
        this.driver = _driver;
    }

    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By livingPage = By.linkText("Living");
    By dropdown = By.xpath("//div[@class='kuFilterHead kuCollapse'][contains(.,'Size')]");
    By selectDropdownBySize = By.cssSelector("[data-optioncount='10'] [title='M'] .kuFilterIcon");
   

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void sortItemsBySize(){
        try{
            driver.findElement(livingPage).click();
            driver.findElement(dropdown).click();
            driver.findElement(selectDropdownBySize).click();

        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}


