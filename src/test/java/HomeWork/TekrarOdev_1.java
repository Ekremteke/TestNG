package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TekrarOdev_1 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://www.amazon.co.uk/");
    }
    @Test
    public void test1()  throws InterruptedException {
        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("bilgisayar" + Keys.ENTER);
        Thread.sleep((2000));
        driver.navigate().to("https://facebook.com");
        driver.navigate().refresh();
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        WebElement temizle = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        temizle.click();
        temizle.clear();
        WebElement search2 = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search2.sendKeys("s22" + Keys.ENTER);
    }
    @AfterMethod
    public void afterMethod() {
        WebElement results = driver.findElement(By.className("sg-col-inner"));
        System.out.println("arama sonuclari " + results.getText());
    }
    @AfterClass
    public void afterClass() {
        driver.close();
    }
}
