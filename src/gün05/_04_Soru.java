package gün05;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;

public class _04_Soru extends BaseDriver {
// Senaryo:
    // 1-  https://qa-practice.netlify.app/auth_ecommerce  sayfasınız açınız
    // 2-  Email kutucuğuna "admin@admin.com" i yaziniz
    // 3-  Password kutucuğuna "admin123" yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  Açılan yeni sayfada "SHOPPING CART" yazısının göründüğünü Assert ile doğrulayınız

@Test//main yerine
    public void Test1(){
    driver.get("https://qa-practice.netlify.app/auth_ecommerce");

    WebElement email=driver.findElement(By.id("email"));
    email.sendKeys("admin@admin.com");

    WebElement password=driver.findElement(By.id("password"));
    password.sendKeys("admin123");

    WebElement submint=driver.findElement(By.id("submitLoginBtn"));
    submint.click();

    WebElement shoppingCartmesaj=driver.findElement(By.className("section-header"));

    Assert.assertTrue("aranan mesaj bulunamadı",shoppingCartmesaj.getText().contains("SHOPPING CART"));

    BekleKapat();

    }
}
