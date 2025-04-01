package gün05;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Utlity.BaseDriver.BekleKapat;
import static Utlity.BaseDriver.driver;

public class _02_Soru extends BaseDriver {
    // Senaryo:
    // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
    // 2-  isim kutucuğuna adınızı yazdırınız
    // 3-  soyad kutucuğuna soyadınız yazdırınız
    // 4-  Submit butona tıklatınız (click)
    // 5-  "Thank You" yazısını görünüyor ise "TEST PASSED" yazdırınız
    @Test
    public void test1(){
        //test yazım bölgesi
        driver.get("https://form.jotform.com/221934510376353");

        WebElement isimKutusu= driver.findElement(By.id("first_8"));//id kısma
        isimKutusu.sendKeys("ismet");//ismet yaz

        WebElement soyadKutusu= driver.findElement(By.id("last_8"));
        soyadKutusu.sendKeys("temur");//temur yaz

        WebElement submitButton= driver.findElement(By.id("input_2"));
        submitButton.click();//tıkla click

        WebElement tesekkurYazisi=driver.findElement(By.className("thankyou-main-text"));
        System.out.println("tesekkurYazisi.getText() = " + tesekkurYazisi.getText());//teşekkür yazısı var mı
     //   if (tesekkurYazisi.getText().contains("Thank you!"))
          //  System.out.println("test passed");
       // else
          //  System.out.println("faild");
        Assert.assertTrue("aranılan bulunamadı",tesekkurYazisi.getText().contains("Thank You"));


        BekleKapat();

    }
}
