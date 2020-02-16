package com.test.pages;

import com.test.pages.PageBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UrunPage extends PageBase {
    //Constructor
    public UrunPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public WebElement iconBasket(){
    return driver.findElement(By.cssSelector(".iconBasket"));
}
    public WebElement productPrice(){
        return driver.findElement(By.xpath("//div[@class='newPrice']/ins"));
    }
    public WebElement btnBasket(){
        return driver.findElement(By.cssSelector("span[class='icon iconBasket']"));
    }
}
