package gün04;

import Utlity.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class _03_WebElementGetText {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");//web sitesi git

        WebElement LabelFirtname = driver.findElement(By.id("sublabel_8_first"));// id ile elemanı bul
         //gettext();web elementin ekranda görünen yazısını verir
        String elementinGörüntüsüYazisi= LabelFirtname.getText();//gettext herkesin gördügü
        System.out.println("elementinGörüntüsüYazisi = " + elementinGörüntüsüYazisi);

        WebElement Labellastname=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("Labellastname = " + Labellastname.getText());




                MyFunc.Bekle(3);
        driver.quit();
    }
}
