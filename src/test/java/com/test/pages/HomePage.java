package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class HomePage extends PageBase {
    //Consturctor
    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        //driver.get("https://www.n11.com/");
    }
    //Web Element
    public String btnSignIn = "btnSignIn"; //classname

    public List<WebElement> productsList(){
        return driver.findElements(By.xpath(".//*[@class='newPrice']"));
    }

    public WebElement searchInput(){
        return driver.findElement(By.id("searchData"));
    }
    public WebElement iconClick(){
        return driver.findElement(By.cssSelector(".iconSearch"));
    }
    public WebElement twoPage(){
        return driver.findElement(By.xpath(".//a[text()='2']"));
    }
}
