package org.example.tests;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Driver;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.io.File;
import static com.codeborne.selenide.Selenide.*;
public class testSelenide {



SelenideElement inputFile = $x("//input[@type='file']");
SelenideElement BlueBotton = $x("//button[@type='button' and @class='btn class1 btn-primary btn-test']");

    @BeforeTest
    public void testConf(){


            Configuration.browser=System.setProperty("browser","chrome");
            Configuration.headless=false;
            Configuration.downloadsFolder= "src/main/java/resources/downloadDirectory";
    }



    @Test
    public void testSelenide(){
        open("http://www.uitestingplayground.com/upload");
 File fileToUpload = new File("C:\\Program Files\\Java\\avtotest\\untitled7maven\\src\\main\\java\\resources\\toUpload\\upload.txt ");
Selenide.switchTo().frame(0);
inputFile.uploadFile(fileToUpload);
//$("//input[@type='file']").uploadFile(fileToUpload)
    }




@Test (testName ="classAtribute")

public void classAtribute () {

        open("http://www.uitestingplayground.com/classattr");
     $("//button[@type='button' and @class='btn class1 btn-primary btn-test']");


}

}


//    $x("//button[@type='button' and @class='btn class1 btn-primary btn-test']")
