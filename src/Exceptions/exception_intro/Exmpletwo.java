package Exceptions.exception_intro;

import java.util.Arrays;

public class Exmpletwo {

    public static void main(String[] args) {
        try{
            int arr[] = new int[7];
            arr[4] = 30;
            System.out.println(Arrays.toString(arr));
            arr[5] = 23/0;
            System.out.println("inside try block");

        }
        catch (ArithmeticException e){
            System.out.println(" Warning : Arithimetic Exception");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("outside of an array ... ");
        }

        catch (Exception e){
            System.out.println("something went wrong ");
        }
        System.out.println("outside of try catch block ... ");
    }
}
