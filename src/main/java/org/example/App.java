package org.example;

import org.testng.Assert;
import org.testng.annotations.*;



public class App {


    @DataProvider(name ="equivalentClasses" )

public Object[][] dataProvider() {



    return new  Object [][]{{-1, false},{0, true},{1, true},{50, true},{99, true},{100, true},{101, false}};

    }


    @BeforeMethod
    public void preStep(){
        System.out.println("Podgotovka");


    }

    @AfterMethod
    public void afterStep(){
        System.out.println(" Kill session ");
    }


@Test (dataProvider = "equivalentClasses" )
    public void testOne(int x, boolean isCorrect ){
        System.out.println(x);
        Assert.assertTrue(isCorrect);
}


    }



