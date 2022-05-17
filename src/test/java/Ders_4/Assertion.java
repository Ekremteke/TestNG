package Ders_4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Assertion {
    static WebDriver driver;
    @BeforeClass
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @Test
    public void test1(){

//        Assert.assertEquals(); // String olan metinler uzerinden yapiyoruz
//        Assert.assertFalse(); // aradigimiz urunun ekranda gozukmemesi gerekiyor
//        Assert.assertTrue(); // aradigimiz urunun ekranda olmasi gerekiyor

        driver.get("https://google.com");
        String title= driver.getTitle(); // Google'in title'ini alacagiz

        //asagidada dogrulamasini yapacagiz
        Assert.assertEquals("Google", title);

        System.out.println("Testimiz basarili yani google title mevcut");
    }
    @Test
    public void test2(){
        driver.get("https://youtube.com");

        String youTubeTitle = driver.getTitle();
        System.out.println("youTubeTitle==>" + youTubeTitle);

        boolean iceriyormu = youTubeTitle.contains("YouTube");
        Assert.assertTrue(iceriyormu);
    }
    @Test
    public void test3() {
        driver.get("https://facebook.com");

        String facebookTitle = driver.getTitle();
        System.out.println("FaceBook Title==>" + facebookTitle);

        boolean iceriyormu = facebookTitle.contains("YouTube");
        Assert.assertFalse(iceriyormu);


    }
    }
