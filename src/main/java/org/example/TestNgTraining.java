package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestNgTraining extends BaseTest {

    @Test
     public void TestNgTraining() throws IOException {
        String propValue = getPropety("user");
        System.out.println(propValue);
    }



    String name ="gaz";
    int gazReadings=20;
    int gazTariff = 50;
    int calc = gazReadings*gazTariff;
    int skidka = 50;
    int total = calc-skidka;







@Test //test1
public void negativSridka(){
    Assert.assertNotEquals(skidka,54, "Проверка на отрицательную скидку");

}

@Test //test2
public void negativeCalc(){Assert.assertTrue(calc>0, "проверка на отрицательную сумму ");}

    @Test//test3
    public void negativeTotal(){Assert.assertFalse(total<0, "проверка на отрицательную оющую сумму");}

    @Test//Test4
    public void testingName(){
    Assert.assertEquals(name,"gaz");


}
}

