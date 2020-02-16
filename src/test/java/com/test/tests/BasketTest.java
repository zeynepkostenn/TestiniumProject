package com.test.tests;

import com.test.pages.BasketPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class BasketTest extends TestBase {
    public String basketProductPrice;
    WebElement spinner;
    BasketPage basket=new BasketPage(driver,wait);

    public void priceCompare(String urunPrice) throws InterruptedException {
       // urunTest.addToBasket();
        Thread.sleep(3000);
        basketProductPrice=basket.priceBasket().getText();
        Thread.sleep(3000);
        logger.info("Ürünün sepetteki fiyatı: "+basketProductPrice);
        Thread.sleep(3000);
        //fiyatlar aynı mı karşılaştırma yapılır
        Assert.assertEquals("Ürün fiyatı, ürün sayfası ve sepette aynı değil!",urunPrice,basketProductPrice);
        numberCompare();
    }
    private void numberCompare() throws InterruptedException{
        Thread.sleep(3000);
        //ürün adeti arttırılır
        basket.spinnerUp().click();
        Thread.sleep(3000);
        spinner=basket.spinnerNumber();
        Thread.sleep(3000);
        //ürün adetinin 2 olduğu doğrulanır
        if (spinner.getAttribute("value").equals("2")){
           logger.debug("Ürün adeti 2'dir.");
        }else{
            logger.debug("Ürün adeti 2 değildir.");
        }
        Thread.sleep(3000);
        logger.info("ürün siliniyor.....");
        productDelete();
    }
    private void productDelete() throws InterruptedException {
        Thread.sleep(3000);
        //ürün sepetten silinir
        basket.btnDelete().click();
        Thread.sleep(3000);
        //sepetin boş olduğu kontrol edilir
        try{
            logger.debug(basket.basketContainer().getText());

        }catch (Exception e){
            logger.debug("Sepet dolu");
        }
    }
}
