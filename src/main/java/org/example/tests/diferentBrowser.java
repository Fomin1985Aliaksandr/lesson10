package org.example.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class diferentBrowser extends BaseTest {

    WebDriver driver;

    public diferentBrowser(WebDriver driver) {
        super(driver);
    }


    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrom.driver", "C:\\Users\\newus\\Downloads\\chrome-win64");

        driver = new ChromeDriver();

String name = "";




    }

}
