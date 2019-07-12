package Operators.Assignment_Operator;

public class Assignemnt_Operator {

    public static void main(String[] args) {
        int a =1;
        int b = 2;
        int c = 3;

        a += 5;
        b *= 4;
        c -= a * b;
        c %= 6;

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        int numArray[] = {2,3,4,5,6,7,8};
        //String x[] = {"rijan"};
        for (int i = 0; i < numArray.length; i++){
            if (numArray[i] % 2 == 0){
                System.out.println("these are the even number from array : " + numArray[i]);
            }

            if (numArray[i] % 2 == 1){
                System.out.println("these are the odd number from array : " + numArray[i]);

            }
        }

        System.out.println("Length of array is: " + numArray.length);



    }
}

