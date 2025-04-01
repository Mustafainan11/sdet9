package Utlity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
//static en başta yer alması extends alarak yapıyor
    static {//Nesne yazmadan oluyor
        KalanOncekileriKapat();
        driver = new ChromeDriver();

        driver.manage().window().maximize(); // Ekranı max yapıyor.browser açıldıgında Büyük ekran
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); // 20 sn mühlet: elementi bulma mühleti
    }


    public static void BekleKapat() {
        MyFunc.Bekle(3);
        driver.quit();
    }
    public static void KalanOncekileriKapat() {//faildleri kapatırıyor.
        try {
            Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
        } catch (Exception ignored) {

        }
    }
}