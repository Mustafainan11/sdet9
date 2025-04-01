package gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        // Senaryo:
        // 1-  https://form.jotform.com/221934510376353  sayfasınız açınız
        // 2-  Bütün label ları bulup textlerini yazdırınız
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement element= driver.findElement(By.className("form-sub-label"));
        System.out.println("element.getText() = " + element.getText());//element.getText() = First Name
        //findelement:form-sub-label birden fazla varsa ilkini veriyor

        //bütün elemanların form-sub-label almak için findElements son s olcak hepsi demek
        List<WebElement> etiketler=driver.findElements(By.className("form-sub-label"));
        System.out.println("etiketler.size() = " + etiketler.size());//sayısı verisyor size
        for (WebElement e:etiketler)//for each ile ver hepsini
            System.out.println("e.getText() = " + e.getText());




        MyFunc.Bekle(3);
        driver.quit();

    }
}
