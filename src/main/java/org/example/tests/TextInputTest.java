//package org.example.tests;
//import org.example.pages.HomePage;
//import org.example.pages.TextInputPage;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//
//
//
//public class TextInputTest extends BaseTest {
//
//    HomePage homePage = new HomePage(driver);
//    TextInputPage textInputPage = new TextInputPage(driver);
//
//    public TextInputTest(WebDriver driver) {
//        super(driver);
//    }
//
//
//    @Test
//    public void textInputTest(){
//        homePage.getTestDirectory(HomePage.Links.TEXT_INPUT);
//        String startButtonValue = textInputPage.getTextFromButton();
//
//        String expectedText = textInputPage.setText("Hallo world");
//        String actualText = textInputPage.getTextFromButton();
//
//
//        Assert.assertEquals(expectedText, actualText);
//        Assert.assertNotEquals(actualText, startButtonValue);
//
//
//    }
//}