package CssSelector_Ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_Soru extends BaseDriver {
    //6-
    //
    //Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
    //
    //Fake Alerts'e tıklayınız.
    //
    //Show modal dialog buttonuna tıklayınız.
    //
    //Ok'a tıklayınız.
    //
    //Alert kapanmalıdır.
     //

    @Test
    public void Test3() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(2);

        WebElement clickMe = driver.findElement(By.cssSelector("[id='fakealerttest']"));
        clickMe.click();
        MyFunc.Bekle(2);

        WebElement show = driver.findElement(By.cssSelector("[id='modaldialog']"));
        show.click();

        WebElement ALERT = driver.findElement(By.cssSelector("[id='dialog-ok']"));
        ALERT.click();
        BekleKapat();
    }
}
