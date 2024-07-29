package org.example.tests;

import org.example.pages.FramesPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class FramesTest  {

    public     By frameI1nput = By.xpath("//input[@name='mytext1']");
    public     By frameI2nput = By.xpath("//input[@name='mytext2']");
    public     By frameI3nput = By.xpath("//input[@name='mytext3']");
    public     By frameI4nput = By.xpath("//input[@name='mytext4']");
    public     By frameI5nput = By.xpath("//input[@name='mytext5']");






    WebDriver driver;

@BeforeMethod
    public void setUp(){
    System.setProperty("webdriver.chrom.driver","src/main/java/resources/driver/chromedriver.exe");

    driver = new ChromeDriver();




}

@Test
    public void openFraimSite() {

    driver.get("http://www.uitestingplayground.com");
   driver.switchTo().newWindow(WindowType.TAB);
    driver.get("https://ui.vision/demo/webtest/frames/");

//String uiVisionHandle = driver.getWindowHandle();
//Set<String> windowHendles = driver.getWindowHandles();
//driver.switchTo().window(windowHendles.toArray()[0].toString());
//String playgroundHandle = driver.getWindowHandle();


driver.switchTo().frame(0).findElement(frameI1nput).sendKeys("Это первый фрейм");
driver.switchTo().defaultContent();
driver.switchTo().frame(1).findElement(frameI2nput).sendKeys("Это второй фрейм");
driver.switchTo().defaultContent();
driver.switchTo().frame(2).findElement(frameI3nput).sendKeys(" Это 3-ий фрейм");
driver.switchTo().defaultContent();
driver.switchTo().frame(3).findElement(frameI4nput).sendKeys(" Это четвертый фреэм");
driver.switchTo().defaultContent();
driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='frame_5.html']")));
driver.findElement(frameI5nput).sendKeys("Это 5-ый фрейм найден по xpath");


}





@AfterMethod
    public void tearDown(){

    driver.quit();
}



    }

