package gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_FindingByName {
    public static void main(String[] args) {
        // Senaryo: (locator olarak name kullanılacak)
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  isim kutucuğuna "ismet" yazdırınız
        // 3-  soyad kutucuğuna "temur" yazdırınız
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");//web sitesi git

        WebElement isimKutusu=driver.findElement(By.name("q8_name[first]"));//By.name first_8 id ile elemanı bul
        isimKutusu.sendKeys("ismet");//isim yaz sendkeys

        WebElement soyadKutusu=driver.findElement(By.name("q8_name[last]"));//by.name ise name olcak id ile elemanı bul
        soyadKutusu.sendKeys("temur");

        MyFunc.Bekle(3);//3 saniye bekle
        driver.quit();//çıkış
    }
}
