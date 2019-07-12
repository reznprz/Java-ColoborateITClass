package Exceptions.exception_intro;

import java.util.Scanner;

public class CustomeException {
    public static void main(String[] args) {
        try{

            System.out.println("Starting of Block");

            throw new MyException("this is an customer exception..");

        }
        catch (MyException e){

            System.out.println("catch block");
            System.out.println(e);

        }
    }

}
class MyException extends Exception{

    String strOne;

    MyException(String strTwo){
        this.strOne = strTwo;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "strOne='" + strOne + '\'' +
                '}';
    }
}