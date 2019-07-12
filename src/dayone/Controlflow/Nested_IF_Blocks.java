package dayone.Controlflow;

import java.util.Random;

public class Nested_IF_Blocks {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt(10);
        System.out.println("value of  a:" + a );

        if ( a >= 5){
            System.out.println("in if block");
            if ( a >=7){
                System.out.println("More than 5");
            }
            else {
                System.out.println("more then 5 less than 7 ");
            }
        }else{
            System.out.println("in else block ");
        }

        int value = random.nextInt(50);
        int count = random.nextInt(50);
        int limit = random.nextInt(50);
        System.out.println("value :" + value);
        System.out.println("count :" + count);
        System.out.println("limit :" + limit);




        if (++value % 2 == 0 && ++count < limit){
            System.out.println("in if block");
            System.out.println("value :" + value);
            System.out.println("count :" + count);
        }
        else{
            System.out.println("in else block");
            System.out.println("value :" + value);
            System.out.println("count :" + count);
        }

    }
}
