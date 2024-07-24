package org.example.tests;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

    WebDriver driver;
    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrom.driver", "src/main/java/resources/driver/chromedriver.exe");

        driver = new ChromeDriver();

    }

    @Test
                public void openGoogle(){

            driver.get("https://www.google.ru/");
  System.out.println("Успех");

        }
@AfterMethod
public void tearDown(){
      //  driver.quit();

}


    }


