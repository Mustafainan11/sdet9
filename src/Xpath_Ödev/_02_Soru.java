package Xpath_Ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Soru extends BaseDriver {
    //1) Bu siteye gidin. -> https://demo.applitools.com/
    //2) Username kısmına "ttechno@gmail.com" girin.
//3) Password kısmına "techno123." girin.
//4) "Sign in" buttonunan tıklayınız.
//5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
    @Test
    public void Test1() {
        driver.get("https://demo.applitools.com/");

        WebElement UserName = driver.findElement(By.xpath("//input[@id='username']"));
        UserName.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(2);

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(2);

        WebElement signin = driver.findElement(By.xpath("//a[@id='log-in']"));
        signin.click();
        MyFunc.Bekle(2);

        WebElement element = driver.findElement(By.xpath("//h6[@id='time']"));
        Assert.assertTrue(element.getText().contains("Your nearest branch closes in: 30m 5s"));
        MyFunc.Bekle(2);


        BekleKapat();
    }
}
