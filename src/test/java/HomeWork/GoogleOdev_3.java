package HomeWork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class GoogleOdev_3 {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://google.com");
        System.out.println("Before Class");
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(2000);
        guvenlikDuvari.click();
        Thread.sleep(2000);
        driver.navigate().to("https://www.dailymotion.com/gb");
        Thread.sleep(6000);
    }
        @Test
        public void test2() throws InterruptedException {
            WebElement guvenlikDuvari1 = driver.findElement(By.xpath("(//*[.='Accept'])[4])"));
            guvenlikDuvari1.click();

    }

            @AfterMethod
        public void afterMethod() {

        }
        @AfterClass
        public void afterClass() {

        }
    }