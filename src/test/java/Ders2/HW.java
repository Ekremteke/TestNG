package Ders2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HW {
    static WebDriver driver;

    @Test
    public void driverTanimla() throws InterruptedException {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        WebElement guvenlikDuvari = driver.findElement(By.xpath("//*[.='I agree']"));
        Thread.sleep(3000);
        guvenlikDuvari.click();

        WebElement catalog=driver.findElement(By.name("q"));
        catalog.sendKeys("city bike"+ Keys.ENTER);
//        catalog.submit();

        WebElement kac = driver.findElement(By.id("result-stats"));
        System.out.println(kac.getText());

        WebElement shopping = driver.findElement(By.partialLinkText("Shopping"));
        shopping.click();

    }}
