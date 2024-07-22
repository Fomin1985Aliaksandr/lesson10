package org.example;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.fail;


@Listeners(MyListner.class)
public class TestNgTraining extends BaseTest {



    @Test(priority = 1)
    public void testOne(){
        System.out.println("Create user");
 fail();

    }


    @Test(priority = 2, dependsOnMethods ="testOne" )
    public void testTwo(){
        System.out.println("Check user");


    }

@Test(priority = 3, dependsOnMethods = "testTwo")
public void testThree(){
    System.out.println("Delete user");

}



}


