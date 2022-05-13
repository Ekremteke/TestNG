package Ders2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class tagName {
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

        WebElement yazi = driver.findElement(By.tagName("a"));
        System.out.println("en bastaki a tag name =>" + yazi.getText());

        System.out.println("--------------");

        List<WebElement> listem=driver.findElements(By.tagName("a"));

        for (WebElement w:listem){
         System.out.println("tagname"+ w.getText());
     }


    }}