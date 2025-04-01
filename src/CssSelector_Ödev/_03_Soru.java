package CssSelector_Ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Soru extends BaseDriver {
 //1) Bu siteye gidin. -> https://www.snapdeal.com/
   //2) "teddy bear" aratın ve Search butonuna tıklayın.
//3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
  //Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

    @Test
    public void Test1() {
        driver.get("https://www.snapdeal.com/");

        WebElement Call = driver.findElement(By.cssSelector("[autocomplete='off'][name='keyword']"));
        Call.sendKeys("teddy bear");
        MyFunc.Bekle(2);

        WebElement signin = driver.findElement(By.cssSelector("[class='searchTextSpan']"));
        signin.click();
        MyFunc.Bekle(2);

        WebElement element = driver.findElement(By.cssSelector("[class='nnn']"));
        Assert.assertTrue(element.getText().contains("We've got 96 results for teddy bear"));
        MyFunc.Bekle(2);


        BekleKapat();
    }
}