package Ders_4;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BeforeClass_AfterClass {

    @BeforeClass
    public static void setUp(){
        System.out.println("Before class calisti");
        //Gidecegimiz sayfaya gidiyoruz
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

    @AfterClass
    public static void teardown(){
        //sayfayi kapatiyoruz
        System.out.println("After class calisti");
    }


}