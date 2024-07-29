
package org.example.pages;

import org.example.tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextInputPage extends BaseTest {


    private final By inputText = By.xpath("//input[@id='newButtonName']");
    private final By button = By.xpath("//button[@id='updatingButton']");

    public String setText(String textToType){

        driver.findElement(inputText).sendKeys(textToType);
        driver.findElement(button).click();
        return textToType;
    }
    public String getTextFromButton(){
        return driver.findElement(button).getText();
    }
    public TextInputPage(WebDriver driver){
        super(driver);
    }
}