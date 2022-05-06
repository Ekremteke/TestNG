import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class driverTanimlama {

    static WebDriverManager driver;

    @Test

    public void driver_Tanimlama(){
// Driverimizi kullanilabilir hale getirdik
        WebDriver driver;
// Driverimizi chromedrivera tanitiyoruz
        WebDriverManager.chromedriver().setup();
//driver nesnesi olusturuyoruz
        driver=new ChromeDriver();
//sayfamizi tam ekran yapiyoruz
        driver.manage().window().maximize();
//sayfamizin yuklenmesi icin driverimizi bekletiyoruz
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

        //ilk deneme
        driver.get("https://google.com");

    }








}