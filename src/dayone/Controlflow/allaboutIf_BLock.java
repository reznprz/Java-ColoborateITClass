package dayone.Controlflow;

import java.util.Random;

public class allaboutIf_BLock {

    public static void main(String[] args) {

        // if conditoin represent block is true

       // if(true){ }

        //1. if block and if else
        //2. if with multiple else
        //3. nested if blocks

        if (true){
            System.out.println("this is true");
        }
        else{
            System.out.println("The conditon is false");
        }

        int num = 5;
        Random random = new Random();
        int i = random.nextInt(7);
        System.out.println(i);
        if ( num <= i){
            System.out.println("this is if block");

        }else {
            System.out.println(" this is else block ");

        }

        int numberofloginattempts = 10;
        int numberofminimumloginattempts = 12;
        int numberofMaxloginAttempts = 13;
        int y = 3;

        // count the number of login attempts a
        //provide if or else condition

        if(numberofloginattempts < numberofMaxloginAttempts || numberofminimumloginattempts > y ){
            y++;
            System.out.println(y);
        }

        int a = random.nextInt(10);
        int b = random.nextInt(10);

        System.out.println("value of a :" + a);
        System.out.println("value of b :" + b);

        if(a>0 || b > 5){
            System.out.println(" if block ");

        }else {
            System.out.println("else block");
        }


    }
}
