package dayone.Controlflow;

import java.util.Scanner;

public class codetest {
    public static void testOne(){
        Scanner key = new Scanner(System.in);
        System.out.println("enter the number");
        int a = key.nextInt();
        if(a >= 0){
            System.out.println("it is positive");
        }else {
            System.out.println("it is negative");
        }
    }
    public static void main(String[] args) {
       //testOne();
        testtwo();
        //testthree();
        //testfour();
    }
    public static void testtwo(){
        Scanner key = new Scanner(System.in);
        System.out.println("enter the 1st number : ");
        int b = key.nextInt();
        System.out.println("enter the 2st number : ");
        int c = key.nextInt();
        System.out.println("enter the 3st number : ");
        int d = key.nextInt();

        if (b > c) {
            if (b > d)
                System.out.println("The greatest: " + b);
        }
            if (c > b)
                if (c > d)
                    System.out.println("The greatest: " + c);

            if (d > b)
                if (d > c)
                    System.out.println("The greatest: " + d);
        }
    /*
     3 Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print
    "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000
    */
    public static void testthree(){

        Scanner k = new Scanner(System.in);
        System.out.println("enter the float number : ");
        Float fnumber = k.nextFloat();

        if (fnumber > 0){

            if ( fnumber < 1){
                System.out.println("the number is small");
            }

            else if( fnumber > 1000000){
                System.out.println("the number is posotive and large");
            }
            else{
                System.out.println("the number is positive ");
            }
        }
        else if (fnumber < 0){
            System.out.println("the number is negative");
        }
        else{
            System.out.println("zero");
        }
    }
    /*
    4. Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places.
     */
    public static void testfour(){
        Scanner k = new Scanner(System.in);
        System.out.println("enter the 1st float number : ");
        Float f1 = k.nextFloat();
        System.out.println("enter the 2st float number : ");
        Float f2 = k.nextFloat();
        if (f1 == f2)
        {
            System.out.println("They are the same up to three decimal places");
        }
        else
        {
            System.out.println("They are different");
        }
    }
}
