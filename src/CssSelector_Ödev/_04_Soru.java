package CssSelector_Ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _04_Soru extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement Calculate = driver.findElement(By.cssSelector("[id='calculatetest']"));
        new Actions(driver).scrollToElement(Calculate).click(Calculate).perform();
        MyFunc.Bekle(2);

        for (int i = 0; i < 5; i++) {
            int sayi1 = MyFunc.RandomSayiVer(100);
            int sayi2 = MyFunc.RandomSayiVer(100);
            int beklenenToplam = sayi1 + sayi2;

            WebElement txtBox1 = driver.findElement(By.cssSelector("[id='number1']"));
            WebElement txtBox2 = driver.findElement(By.cssSelector("[id='number2']"));
            WebElement answerField = driver.findElement(By.cssSelector("span[id='answer']"));
            WebElement clearButton = driver.findElement(By.cssSelector("[id='calculate']"));

            txtBox1.clear();//claer();->Temizle kutucugu eger temirlemezsek 5 kere yan yana yazar sayıları
            txtBox2.clear();//Yani bir önceki yazılan sayıyı temizle

            txtBox1.sendKeys(String.valueOf(sayi1));
            txtBox2.sendKeys(String.valueOf(sayi2));

            WebElement btnCalculate=driver.findElement(By.cssSelector("[id='calculate']"));
            btnCalculate.click();
            MyFunc.Bekle(3);

            WebDriverWait bekle = new WebDriverWait(driver, Duration.ofSeconds(20));
            bekle.until(ExpectedConditions.visibilityOf(clearButton));

            System.out.println("value = " + answerField.getAttribute("value"));
            int olusanToplam = Integer.parseInt(answerField.getAttribute("value"));
            Assert.assertTrue("Toplam hatalı", beklenenToplam == olusanToplam);

            clearButton.click();
        }
        BekleKapat();
        }
    }


