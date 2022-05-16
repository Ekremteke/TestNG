package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GoogleOdev_1 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.get("https://google.com");

        String titleGoogle=driver.getTitle();

        System.out.println("GoogleTitle => "+ titleGoogle);

        String urlGoogle= driver.getCurrentUrl();
        System.out.println("UrlGoogle => "+urlGoogle);

        if(urlGoogle.contains("google")){
            System.out.println("Var 'google' " + urlGoogle);
        }
        else{
            System.out.println("Yok " + urlGoogle);
        }
        if(titleGoogle.contains("Google")){
            System.out.println("Var 'google' " + titleGoogle);
        }
        else{
            System.out.println("Yok " + titleGoogle);
        }

    }
    @Test
    public void test1() throws InterruptedException {
        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(2000);
        guvenlikDuvari.click();

        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("kulaklik"+Keys.ENTER);
    }
    @Test
    public void test2() throws InterruptedException {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("masa"+Keys.ENTER);

    }
    @Test
    public void test3() throws InterruptedException {
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("sandalye"+Keys.ENTER);

    }







}