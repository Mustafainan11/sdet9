package Xpath_Ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_Soru extends BaseDriver {
    //5-
    //Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
    //Fake Alerts' tıklayınız.
    //Show Alert Box'a tıklayınız.
    //Ok'a tıklayınız.
    //Alert kapanmalıdır.
    @Test
    public void Test3() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement Fakealert = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        Fakealert.click();
        MyFunc.Bekle(2);

        WebElement show = driver.findElement(By.xpath("//input[@id='fakealert']"));
        show.click();
        MyFunc.Bekle(2);

        WebElement ALERT = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ALERT.click();
        BekleKapat();

    }
}