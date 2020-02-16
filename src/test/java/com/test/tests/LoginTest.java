package com.test.tests;

import com.test.pages.HomePage;
import com.test.pages.LoginPage;
import org.openqa.selenium.By;

public class LoginTest extends TestBase {
    private String userEmail = "zkostendeneme@gmail.com";
    private String userPassword = "deneme123";

    public void testGiris(HomePage home) throws Exception {

        LoginPage login = new LoginPage(driver,wait);
        login.click(By.className(home.btnSignIn));
        Thread.sleep(3000);
        login.txtEmail().sendKeys(userEmail);
        login.txtSifre().sendKeys(userPassword);
        login.btnGiris().click();
        Thread.sleep(3000);
    }
}
