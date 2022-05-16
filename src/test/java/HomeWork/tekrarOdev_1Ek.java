package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class tekrarOdev_1Ek {
    static WebDriver driver;
    @BeforeClass
    public static void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS.SECONDS);
    }
    @BeforeMethod
    public static void bmethod() throws InterruptedException {
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }
    @Test
    public void test1() throws InterruptedException {
        driver.get("https://youTube.com");
        Thread.sleep(4000);
        WebElement guvDuvar = driver.findElement(By.xpath("//*[.='Accept all']"));
        guvDuvar.click();
        Thread.sleep(3000);
        WebElement search = driver.findElement(By.cssSelector("input[id='search']"));
        Thread.sleep(3000);
        search.click();
        search.sendKeys("Cahildim"+ Keys.ENTER);
        WebElement cahildim=driver.findElement(By.xpath("(//*[.='Cahildim'])[4]"));
        Thread.sleep(3000);
        cahildim.click();
        Thread.sleep(13500);
        WebElement skipad =driver.findElement(By.className("ytp-ad-skip-button-container"));
        skipad.click();
        Thread.sleep(2350);
    }
    @Test
    public void test2() throws InterruptedException {
        WebElement search = driver.findElement(By.cssSelector("input[id='search']"));
        search.click();
        search.clear();
        Thread.sleep(3000);
        search.sendKeys("cars trailer"+ Keys.ENTER);
        WebElement trailer=driver.findElement(By.xpath("(//*[.='trailer'])[4]"));
        Thread.sleep(3000);
        trailer.click();
        Thread.sleep(15000);
    }
    @Test
    public void test3() throws InterruptedException {
        driver.navigate().to("http://google.com");
        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(2000);
        guvenlikDuvari.click();
        WebElement search = driver.findElement(By.name("q"));
        Thread.sleep(2000);
        search.sendKeys("Our Planet"+Keys.ENTER);
        Thread.sleep(2000);
        WebElement sonuc= driver.findElement(By.id("result-stats"));
        Thread.sleep(2000);
        System.out.println(sonuc.getText());
    }
    @AfterMethod
    public void aT(){
    }
    @AfterClass
    public void aC () {
       driver.close();
    }
}