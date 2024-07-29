package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPages extends BasePage {



public     By frameI1nput = By.xpath("//input[@name='mytext1']");
public     By frameI2nput = By.xpath("//input[@name='mytext2']");
public     By frameI3nput = By.xpath("//input[@name='mytext3']");
public     By frameI4nput = By.xpath("//input[@name='mytext4']");
public     By frameI5nput = By.xpath("//input[@name='mytext5']");


    public void getFrameByIndex(int frameIndex){
driver.switchTo().frame(frameIndex);
    }



   public FramesPages(WebDriver driver) {
        super(driver);
    }

}
