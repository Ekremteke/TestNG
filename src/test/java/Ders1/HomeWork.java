package Ders1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    static WebDriverManager driver;

    @Test
    public void driver_Tanimlama() throws InterruptedException {

        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        driver.get("https://google.com");

        Thread.sleep(2000);

        driver.manage().window().maximize();

        driver.navigate().to("https://youtube.com");

        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(2000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.quit();

    }
}
