package Xpath_Ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_Soru extends BaseDriver {
    //Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
    //Fake Alerts'e tıklayınız.
    //Show modal dialog buttonuna tıklayınız.
    //Ok'a tıklayınız.
    //Alert kapanmalıdır.

    @Test
    public void Test3() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement fakealert = driver.findElement(By.xpath("//a[@id='fakealerttest']"));
        fakealert.click();
        MyFunc.Bekle(2);

        WebElement show = driver.findElement(By.xpath("//input[@class='styled-click-button']"));
        show.click();
        MyFunc.Bekle(3);

        WebElement ALERT = driver.findElement(By.xpath("//button[@id='dialog-ok']"));
        ALERT.click();
        BekleKapat();
    }
}