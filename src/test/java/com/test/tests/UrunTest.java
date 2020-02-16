package com.test.tests;

import com.test.pages.UrunPage;

public class UrunTest extends TestBase {
    public  String price;

    public void addToBasket() throws InterruptedException {
        UrunPage urun=new UrunPage(driver,wait);
        Thread.sleep(3000);
        price=urun.productPrice().getText();
        logger.info("ürün sayfasındaki fiyat: "+price);
        Thread.sleep(3000);
        urun.btnBasket().click();
        Thread.sleep(5000);
        urun.iconBasket().click();
        Thread.sleep(3000);
        //fiyat karşılaştırma metodu
        BasketTest basketTest = new BasketTest();
        basketTest.priceCompare(price);
    }
}
