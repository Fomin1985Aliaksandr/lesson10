package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class TestBrowser extends BaseTest {



//    @Test(description ="test1",timeOut = 9000, testName = "test11")//Test#1
//    public void testOpenBrowser(){
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//
//        driver.get("https://www.google.by/");
//
//        driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("SHESS" + Keys.ENTER);
//
//driver.quit();
//
//
//   }




@Test()
    public void testSoftAsert(){
    int a = 5;
    int b = 10;


    SoftAssert softAssert = new SoftAssert();
    softAssert.assertEquals(b,10);
    softAssert.assertEquals(a,5);
    softAssert.assertEquals(a+b,15);
    softAssert.assertAll();








}


    }










