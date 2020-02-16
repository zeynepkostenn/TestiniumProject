package com.test.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage extends PageBase {

    //constructor
    public BasketPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//    public WebElement iconBasket(){
//        return driver.findElement(By.cssSelector(".iconBasket"));
//    }
    public WebElement priceBasket(){
        return driver.findElement(By.className("priceArea"));
    }
    public WebElement spinnerUp(){
        return driver.findElement(By.xpath("//div[@class='spinnerFieldContainer']/span[@class='spinnerUp spinnerArrow']"));
    }
    public WebElement spinnerNumber(){
        return driver.findElement(By.xpath("//input[@class='quantity']"));
    }
    public WebElement btnDelete(){
        return driver.findElement(By.cssSelector(".svgIcon_trash"));
    }
    public WebElement basketContainer(){
        return driver.findElement(By.xpath("//div[@class='cartEmptyText']/h2"));
    }
}
