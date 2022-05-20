package HomeWorkDropDown;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Test {
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

    @org.testng.annotations.Test
    public void test1() throws InterruptedException {
        WebElement category = driver.findElement(By.id("searchDropdownBox"));
        Thread.sleep(3000);
        Select select = new Select(category);
        Thread.sleep(3000);
        select.selectByVisibleText("Computers");
        WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(3000);
        box.click();
        Thread.sleep(3000);
        box.sendKeys("Computer mice"+ Keys.ENTER);
        WebElement veri = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Thread.sleep(3000);
        String reult = veri.getText();
        System.out.println("result ==> " + reult);
        WebElement image = driver.findElement(By.className("s-image"));
        Thread.sleep(3000);
        boolean gorunuyormu = image.isDisplayed();
        Thread.sleep(3000);
        Assert.assertTrue(gorunuyormu);
    }
    @org.testng.annotations.Test
    public void test2() throws InterruptedException {
        WebElement category2 = driver.findElement(By.id("searchDropdownBox"));
        Thread.sleep(3000);
        Select select2 = new Select(category2);
        Thread.sleep(3000);
        select2.selectByIndex(13);
        WebElement box2 = driver.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(3000);
        box2.clear();
        Thread.sleep(3000);
        box2.sendKeys("tea glass"+ Keys.ENTER);
        WebElement veri2 = driver.findElement(By.className("a-price"));
        Thread.sleep(3000);
        System.out.println("<tea glass> Fiyati ==> " + veri2.getText());
        WebElement resim2 = driver.findElement(By.xpath("(//img[@class='s-image'])[4]"));
        Thread.sleep(3000);
        boolean tiklaniyormu = resim2.isSelected();
        Thread.sleep(3000);
        Assert.assertFalse(tiklaniyormu);
    }
    @AfterClass
    public void ac(){
        driver.close();
    }
}
