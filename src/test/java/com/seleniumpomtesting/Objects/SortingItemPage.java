package com.seleniumpomtesting.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SortingItemPage {
    WebDriver driver;

    public SortingItemPage(WebDriver _driver){
        this.driver = _driver;
    }

    By acceptCookies = By.id("onetrust-accept-btn-handler");
    By livingPage = By.linkText("Living");
    By dropdown = By.xpath("//div[@class='kuDropdownLabel']");
    By selectFromDropdown = By.cssSelector("div.kuDropdown.kuDropSortBy > div.kuDropdownOptions > div:nth-child(2)");
   

    public void acceptCookies(){
        try{
            driver.findElement(acceptCookies).click();
        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }

    public void sortItemsByPrice(){
        try{
            driver.findElement(livingPage).click();
            driver.findElement(dropdown).click();
            driver.findElement(selectFromDropdown).click();

        }catch(Exception e){
            System.out.println("Exceptions Caught" + e.getMessage());
        }
    }
}
