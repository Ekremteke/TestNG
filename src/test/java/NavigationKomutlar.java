import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class NavigationKomutlar {

    static WebDriverManager driver;

    @Test
    public void driver_Tanimlama() throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        //   driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        //1- get()  herhangi bir syafaya gitmek icin kullaniyoruz.
        driver.get("https://google.com");

        Thread.sleep(200);

        //2- navigate().to()   ==> bulundugumuz sayfadan baska bir sayfaya gitmemizi saglar.
        driver.navigate().to("https://amazon.com");

        Thread.sleep(200);

        //3-navigate().back   ==>geldigimiz sayfaya geri donmemizi saglar
        driver.navigate().back();

        Thread.sleep(200);

        //4-navigate().forward();
        driver.navigate().forward();

        Thread.sleep(200);

        //5-calistigimiz sayfayi buyutmeye yariyor
        driver.manage().window().maximize();

        Thread.sleep(300);
        //6-navigate().refresh()  calistigimiz sayfayi guncellemeye(yineleme) yapar.
        driver.navigate().refresh();

        //7-close() calistigimiz sayfayi kapatmaya yariyor
        //    driver.close();

        Thread.sleep(300);

        //8-quit()  calistigimiz tum sayfayi kapatir
        driver.quit();


    }
}
