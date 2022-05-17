package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class isDisplayHW {

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @BeforeMethod
    public static void BM(){
        driver.get("https://www.bestbuy.com");
    }
    @Test
    public void test1() throws InterruptedException {


        Thread.sleep(2000);

        String best = driver.getTitle();
        System.out.println("Bestbuy Title==>" + best);

        boolean iceriyormu = best.contains("Best");
        Assert.assertTrue(iceriyormu);
    }
        @Test
        public void test2()  {

        WebElement logo = driver.findElement(By.className("logo"));

        boolean gorunuyormu = logo.isDisplayed();
        Assert.assertTrue(gorunuyormu);
    }
    @Test
    public void test3()  {

        WebElement MExicoLinkTest = driver.findElement(By.partialLinkText("Mexico"));

        boolean gorunuyormu = MExicoLinkTest.isDisplayed();
        Assert.assertTrue(gorunuyormu);

}
@AfterClass
    public void tearDown(){
        driver.close();
}

}
