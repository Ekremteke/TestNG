package HomeWork;



import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDownHW {
        static WebDriver driver;
        @BeforeClass
        public static void setUp() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        @Test
        public void test1() throws InterruptedException {
            driver.get("https://amazon.com");
            WebElement dropDown=driver.findElement(By.id("searchDropdownBox"));




            Select select=new Select(dropDown);

            select.selectByVisibleText("Software");

            Thread.sleep(2000);

            WebElement java =driver.findElement(By.id("twotabsearchtextbox"));

            Thread.sleep(2000);

            java.sendKeys("java" + Keys.ENTER);

            System.out.println("--------------");

            WebElement sonuc = driver.findElement(By.className("sg-col-inner"));

        }
    }
