package dayone.LoopsInjava;

import java.util.Random;

public class javawhilelooptest {

    //print the 10 random decimal number

    public static void main(String[] args) {
        Random r = new Random();
        double d = r.nextDouble();
       // int i = random.nextInt(7);
        while(d <= 10){
            System.out.println(d);
            d++;
        }
    }
}
