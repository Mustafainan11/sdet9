package gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingByIdNotFoundException {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");//web sitesi git
        try {
            WebElement isimKutusu = driver.findElement(By.id("hatalıLocator"));//first_8 id ile elemanı bul
            
        } catch (Exception ex) {
            System.out.println("WEB elemen bulunamadı " + ex.getMessage());

        }
        MyFunc.Bekle(3);
        driver.quit();
    }
}