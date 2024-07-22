package org.example;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){

        System.out.println("Test failed111");


    }
}

