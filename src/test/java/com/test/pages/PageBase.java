package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageBase {
    public WebDriver driver;
    public WebDriverWait wait;
    //Constructor
    public PageBase (WebDriver driver, WebDriverWait wait){
        this.driver = driver;
        this.wait = wait;
    }
    //Click Method
    public void click (By elementLocation) {
        driver.findElement(elementLocation).click();
    }

}
