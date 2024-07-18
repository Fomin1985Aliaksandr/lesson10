package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Scanner;
public class App {




    @Test//Test1
    public void raduisIsNull(){

        double raduis = 0;
        Assert.assertTrue(raduis==0, "немо");
        System.out.println(" неможет быть равен Null ");
    }


    @Test//test2

    public void negativRadius(){
        double raduis = -3;
        Assert.assertFalse(raduis<0, "Не может быть отрицательным ");

    }

    @Test//Test3
    public void positivRadius(){
        double radius = 5;
        Assert.assertEquals(radius>0, "positiv");
    }

    public static void main (String[] args){




        Scanner scanner = new Scanner(System.in);
        System.out.println(" Для определения длинны окружности задайте радиус ");
        double radius;






        radius = scanner.nextInt();
        double result = 2*Math.PI*radius;

        if(radius==0){
            System.out.println("Радиус не может быть равен NULL");
        }
        else if(radius<0){
            System.out.println(" Радиус не может быть отрицацельный ");
        }
        else{
            System.out.println("Радус равен " + result );
        }






    }



}