package CssSelector_Ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_Soru extends BaseDriver {
    /*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.
*/
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/text-box");

        WebElement FullName = driver.findElement(By.cssSelector("[id='userName'][autocomplete='off']"));
        FullName.sendKeys("Automation");
        MyFunc.Bekle(2);

        WebElement eMail = driver.findElement(By.cssSelector("[placeholder='name@example.com'][type='email']"));
        eMail.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(2);

        WebElement CurrentAddress = driver.findElement(By.cssSelector("[placeholder='Current Address']"));
        CurrentAddress.sendKeys("Testing Current Address");
        MyFunc.Bekle(2);

        WebElement PermanentAddress=driver.findElement(By.cssSelector("[id='permanentAddress']"));
        PermanentAddress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(2);

        WebElement loginButton = driver.findElement(By.cssSelector("[id='submit'][type='button']"));
        loginButton.click();
        MyFunc.Bekle(2);

        WebElement element = driver.findElement(By.cssSelector("[id='name']"));
        Assert.assertTrue(element.getText().contains("Automation"));
        MyFunc.Bekle(2);

        WebElement Emailvr=driver.findElement(By.cssSelector("[id='email'][class='mb-1']"));
        Assert.assertTrue(Emailvr.getText().contains("Testing@gmail.com"));
        MyFunc.Bekle(2);

        WebElement Testingcureent=driver.findElement(By.cssSelector("[id='currentAddress'][class='mb-1']"));
        Assert.assertTrue(Testingcureent.getText().contains("Testing Current Address"));
        MyFunc.Bekle(2);

        WebElement Parmananet=driver.findElement(By.cssSelector("[id='permanentAddress'][class='mb-1']"));
        Assert.assertTrue(Parmananet.getText().contains("Testing Permanent Address"));
        MyFunc.Bekle(2);

        BekleKapat();



    }
}
