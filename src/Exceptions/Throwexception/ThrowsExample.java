package Exceptions.Throwexception;

public class ThrowsExample {


    public static void main(String[] args) {

        try{
            myMethod();
        }
        catch (ArithmeticException e){

        }
        catch (NullPointerException e){

        }
    }



    public static void myMethod () throws ArithmeticException, NullPointerException{

    }
}
