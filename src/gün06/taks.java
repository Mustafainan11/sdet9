package gün06;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class taks extends BaseDriver {
    @Test//main yerine
    public void Test1() {
        driver.get("https://www.akakce.com/akakcem/giris/");

        WebElement email = driver.findElement(By.cssSelector("input[id='life']"));
        email.sendKeys("vokiwec222@dmener.com");

        WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
        password.sendKeys("Password123");

        WebElement submit = driver.findElement(By.cssSelector("[type='submit'][class='s'][value='Giriş yap']"));
        submit.click();

        WebElement shoppingCartMesaj= driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        shoppingCartMesaj.click();
        WebElement profilismi= driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        Assert.assertTrue("Profil ", profilismi.getText().contains("TestUser"));

        BekleKapat();
        driver.quit();
    }
    }
