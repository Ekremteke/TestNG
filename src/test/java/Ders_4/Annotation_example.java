package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Annotation_example {

    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod() throws InterruptedException {
        driver.get("https://google.com");


    }
    @Test
    public void test1() throws InterruptedException {
        WebElement guvenlikDuvari=driver.findElement(By.xpath("//*[.='Ik ga akkoord']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("Elma"+ Keys.ENTER);
    }
    @Test
    public void test2() throws InterruptedException {
        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("bisiklet"+Keys.ENTER);
    }
    @Test
    public void test3() throws InterruptedException {
        WebElement arama= driver.findElement(By.name("q"));
        arama.sendKeys("kulaklik"+Keys.ENTER);
    }

    @AfterMethod
    public void AfterMethod(){
        WebElement sonuc= driver.findElement(By.id("result-stats"));
        System.out.println(sonuc.getText());
    }
    @AfterClass
    public void tearDown(){
        driver.close();
    }

}