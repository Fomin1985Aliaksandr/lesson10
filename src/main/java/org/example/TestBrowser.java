package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.testng.annotations.*;

public class TestBrowser extends BaseTest {


    @BeforeTest
    public void beforeTest(){
        System.out.println("Turn on the computer");
    }
    @AfterTest
    public void afterTest (){System.out.println("Turn off the computer");}


    @BeforeMethod
    public void beforMethod(){
        System.out.println("Chose page for test");

    }



    @AfterMethod
    public void afterMethod (){
        System.out.println("Close testing page");


    }


@BeforeClass
public void beforeClass(){System.out.println("It is beforeClass");}

    @AfterClass
    public void afterClass(){System.out.println("It is afterClass");}



    @Test(description ="test1",timeOut = 9000, testName = "test11")//Test#1
    public void testOpenBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.by/");

        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("SHESS" + Keys.ENTER);

driver.quit();


   }

    @Test()//Test#2
    public void testTwo(){
        System.out.println("Page is opend.Sucses");
    }

}
