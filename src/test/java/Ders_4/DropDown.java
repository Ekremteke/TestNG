package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class DropDown {
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
        driver.get("https://amazon.com");
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement dropDown = driver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(dropDown);

        select.selectByVisibleText("Baby");

        Thread.sleep(3000);

        select.selectByIndex(5); // 5inci siradaki degere gidiyor

        Thread.sleep(3000);

       select.selectByValue("search-alias=computers-intl-ship"); // computersa gidiyor

        WebElement election = select.getFirstSelectedOption();
        System.out.println("son secili eleman==> " + election.getText());

        System.out.println("=========");

        List<WebElement> list = select.getOptions();

        for (WebElement w:list){
            System.out.println(w.getText());
        }

        int toplamSecenekSayisi=list.size();
        System.out.println("Toplam secim sayisi ==> "+ toplamSecenekSayisi);

    }
}
