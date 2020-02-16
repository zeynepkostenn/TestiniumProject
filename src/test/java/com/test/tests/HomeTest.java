package com.test.tests;

import com.test.pages.HomePage;
import org.testng.annotations.Test;

import java.util.Random;

public class HomeTest extends TestBase {
    public String product = "bilgisayar";

    HomePage home = new HomePage(driver,wait);
    @Test(priority = 1)
    public void homePage(){
        String expectedTitle = "n11.com";
        String url = "https://www.n11.com/";
        driver.get(url);
        //anasayfanın açıldığı kontrol edilir
        if(driver.getTitle() != null && driver.getTitle().contains(expectedTitle)){
            logger.debug("Web page is opened");
        }
        else{
            logger.debug("Web page could not open.");
        }
        //login işlemi kontrol edilir
        LoginTest loginTest = new LoginTest();
        try {
            Thread.sleep(5000);
            loginTest.testGiris(home);
        } catch (Exception e) {
            e.printStackTrace();
            logger.debug("Web page could not open.... :" + e.getMessage());
        }
    }
    @Test(priority = 2)
    public void productSearch() throws InterruptedException{
        Thread.sleep(5000);
        HomePage home = new HomePage(driver,wait);
        //arama kutusuna bilgisayar girilir
        home.searchInput().sendKeys(product);
        home.iconClick().click();
        Thread.sleep(3000);
        //2.sayfanın açıldığı kontrol edilir.
        home.twoPage().click();
        Thread.sleep(3000);
        //sergilenen ürünlerden rastgele bir ürün seçilir
        Random random=new Random();
        int index=random.nextInt(28)+1;
        Thread.sleep(3000);
        home.productsList().get(index).click();
        UrunTest urunTest = new UrunTest();
        //sepete eklenir
        urunTest.addToBasket();
    }
}
