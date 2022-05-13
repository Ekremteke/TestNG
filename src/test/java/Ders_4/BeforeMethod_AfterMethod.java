package Ders_4;

import org.testng.annotations.*;

public class BeforeMethod_AfterMethod {
    @BeforeClass
    public static void setUp(){
        System.out.println("Before class calisti");
        //Gidecegimiz sayfaya gidiyoruz
    }

    @BeforeMethod
    public void testtenOnce(){
        System.out.println("Testten once calisti");
    }

    @Test
    public void test1(){
        System.out.println("test 1  calisti");
        //  testlerimizi calistiriyoruz

    }
    @Test
    public void test2(){
        System.out.println("test 2 calisti");
        //  testlerimizi calistiriyoruz
    }

    @AfterMethod
    public void testtenSonra(){
        System.out.println("testten sonra caisti");
    }

    @AfterClass
    public static void teardown(){
        //sayfayi kapatiyoruz
        System.out.println("After class calisti");
    }





}
