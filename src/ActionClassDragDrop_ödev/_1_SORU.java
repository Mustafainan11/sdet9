package ActionClassDragDrop_ödev;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class _1_SORU extends BaseDriver {
    @Test
    public void Test(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        MyFunc.Bekle(2);

        Actions driverAksiyon=new Actions(driver);//browser üzerinde aksiyon yapcam
        //NORVEÇ
        WebElement oslo=driver.findElement(By.xpath("//div[@id='a1']"));//oslo
        WebElement normay=driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q1']"));//norveç
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(oslo).build().perform();//osloyu eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(normay).release().build().perform();//norveç e bırak
        MyFunc.Bekle(3);
        //İSPANYA
        WebElement madrid=driver.findElement(By.xpath("//div[@id='a6']"));//MADRİD
        WebElement spain =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q6']"));//ispanya
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(madrid).build().perform();//madrid eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(spain).release().build().perform();//ispanya e bırak
        MyFunc.Bekle(3);
        //İngiltere
        WebElement london =driver.findElement(By.xpath("//div[@id='a8']"));//LONDON
        WebElement UnitedKingdom =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q8']"));//İNGİLTERE
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(london).build().perform();//LONDON eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(UnitedKingdom).release().build().perform();//İNGİLTERE e bırak
        MyFunc.Bekle(3);
        //İTALYA
        WebElement Rome =driver.findElement(By.xpath("//div[@id='a10']"));//roma
        WebElement ıtaly =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q10']"));//italya
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(Rome).build().perform();//roma eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(ıtaly).release().build().perform();//italya e bırak
        MyFunc.Bekle(3);
         //FRANSA
        WebElement Paris =driver.findElement(By.xpath("//div[@id='a5']"));//PARİS
        WebElement France =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q5']"));//FRANSA
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(Paris).build().perform();//paris eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(France).release().build().perform();//franca e bırak
        MyFunc.Bekle(3);
        //AMERİKA
        WebElement washington =driver.findElement(By.xpath("//div[@id='a4']"));//WASGİNTON
        WebElement AmerikaBirleşikDevletleri =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q4']"));//AMERİKA
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(washington).build().perform();//WASGİNTON eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(AmerikaBirleşikDevletleri).release().build().perform();//AMERİKA e bırak
        MyFunc.Bekle(3);
        //austria
        WebElement vienna =driver.findElement(By.xpath("//div[@id='a9']"));//vienna
        WebElement austria =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q9']"));//austria
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(vienna).build().perform();//vienna eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(austria).release().build().perform();//austria e bırak
        MyFunc.Bekle(3);
        //HİNDİSTAN
        WebElement Nehdehli =driver.findElement(By.xpath("//div[@id='a12']"));//NEHDEHLİ
        WebElement india =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q12']"));//HİNDİSTAN
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(Nehdehli).build().perform();//vienna eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(india).release().build().perform();//HİNDİSTAN e bırak
        MyFunc.Bekle(3);
        //greece
        WebElement athens =driver.findElement(By.xpath("//div[@id='a7']"));//athens
        WebElement greece =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q7']"));//greece
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(athens).build().perform();//athens eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(greece).release().build().perform();//greece e bırak
        MyFunc.Bekle(3);
        //denmark
        WebElement copenhagen =driver.findElement(By.xpath("//div[@id='a3']"));//copenhagen
        WebElement denmark =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q3']"));//denmark
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(copenhagen).build().perform();//copenhagen eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(denmark).release().build().perform();//denmark  e bırak
        MyFunc.Bekle(3);
        //malaysia
        WebElement kualalumpur =driver.findElement(By.xpath("//div[@id='a14']"));//kualalumpur
        WebElement malaysia =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q14']"));//malaysia
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(kualalumpur).build().perform();//kualalumpur eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(malaysia).release().build().perform();//malaysia e bırak
        MyFunc.Bekle(3);
        //sweden
        WebElement stockholm =driver.findElement(By.xpath("//div[@id='a2']"));//stockholm
        WebElement sweden=driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q2']"));//sweden
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(stockholm).build().perform();//stockholm eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(sweden).release().build().perform();//sweden e bırak
        MyFunc.Bekle(3);
        //kenya
        WebElement nairobi =driver.findElement(By.xpath("//div[@id='a13']"));//nairobi
        WebElement kenya =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q13']"));//kenya
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(nairobi).build().perform();//nairobi eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(kenya).release().build().perform();//kenya e bırak
        MyFunc.Bekle(3);
        //chile
        WebElement santiago =driver.findElement(By.xpath("//div[@id='a11']"));//santiago
        WebElement chile =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q11']"));//chile
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(santiago).build().perform();//santiago eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(chile).release().build().perform();//chile e bırak
        MyFunc.Bekle(3);
        //vietnam
        WebElement hanoi =driver.findElement(By.xpath("//div[@id='a15']"));//hanoi
        WebElement vietnam =driver.findElement(By.xpath("//div[@class='dragDropSmallBox' and @id='q15']"));//vietnam
        MyFunc.Bekle(3);

        driverAksiyon.clickAndHold(hanoi).build().perform();//hanoi eline al.
        MyFunc.Bekle(2);
        driverAksiyon.moveToElement(vietnam).release().build().perform();//vietnam e bırak
        MyFunc.Bekle(3);

        BekleKapat();

    }

}
