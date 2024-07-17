package org.example;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {


    protected String getPropety(String key) throws IOException {
        Properties properties = new Properties();
        FileInputStream inputStream = new FileInputStream("src/main/java/resources/application.properties");
        properties.load(inputStream);
        return properties.getProperty(key);

    }



    @BeforeTest
    public void beforeMethod(){
        System.out.println("BeforeTest");

    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("BeforeSuit");

    }
}
