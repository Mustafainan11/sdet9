package gün06;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelector_Ornek extends BaseDriver {
    @Test//main yerine
    public void Test1() {
        driver.get("https://qa-practice.netlify.app/auth_ecommerce");

        WebElement email = driver.findElement(By.cssSelector("input [type='email']"));
        email.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.cssSelector("input [type='password']"));
        password.sendKeys("admin123");

        WebElement submint = driver.findElement(By.cssSelector("button[type='submit'][test-data='submitBtn']"));
        submint.click();

        WebElement shoppingCartmesaj = driver.findElement(By.cssSelector("h2[class='section-header']"));

        Assert.assertTrue("aranan mesaj bulunamadı", shoppingCartmesaj.getText().contains("SHOPPING CART"));

        BekleKapat();
    }
}