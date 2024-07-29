package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class HomePage extends BasePage {


    String linkPattern = "//h3/a[text()='%s']";






    public void getTestDirectory(Links targetLinks ){

        driver.findElement(By.xpath(String.format(linkPattern,targetLinks.linkValue))).click();
    }

    public HomePage(WebDriver driver){

        super(driver);
    }

    public enum Links{

        TEXT_INPUT("Text Input");

        final String linkValue;

        Links(String s){
            linkValue = s;

        }

    }




}