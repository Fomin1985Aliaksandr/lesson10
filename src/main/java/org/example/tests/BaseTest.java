package org.example.tests;

import org.example.pages.FramesPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import java.io.InputStream;
import java.util.Properties;

public class BaseTest {





    protected WebDriver driver;
    public BaseTest(WebDriver driver)


    {


    }

    @BeforeClass
    public void setUp()  {
        System.setProperty("webdriver.chrome.driver", "src/main/java/resources/chromedriver.exe");
        if (driver==null){
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(getFromProperties("homeUrl"));
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public String getFromProperties (String propertyKey)  {
        Properties properties = new Properties();
        InputStream inputStream = ClassLoader.getSystemResourceAsStream("src/main/java/resources/application.properties");

        try {
            properties.load(inputStream);
        }
        catch (Exception e){System.out.println(" Не удвлось обработать "); e.printStackTrace();}

        return properties.getProperty(propertyKey);
    }

}