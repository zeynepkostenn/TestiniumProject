package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends PageBase {
    //Constructor
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement txtEmail(){
        return driver.findElement(By.id("email"));
    }
    public WebElement txtSifre(){
        return driver.findElement(By.id("password"));
    }
    public WebElement btnGiris(){
        return driver.findElement(By.id("loginButton"));
    }
}
