package gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_FindigByLinktext {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");

        WebElement SiparislerimLinki=driver.findElement(By.linkText("Siparişlerim"));//a etiket tam yazman lazım Siparişlerim
        System.out.println("SiparislerimLinki.getText() = " + SiparislerimLinki.getText());


        WebElement LİNK2=driver.findElement(By.partialLinkText("Süper Fiyat"));//eksik yazsan etiketi tam verir.
        System.out.println("LİNK2.getText() = " + LİNK2.getText());
        MyFunc.Bekle(3);
        driver.quit();
    }
}
