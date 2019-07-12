package Exceptions.Throwexception;

public class ThrowExample {

    public static void main(String[] args) {
        checkEleigibility(10,39);
    }

    static void checkEleigibility(int stuAge, int stuWeight){
        if(stuAge < 12 && stuWeight < 40){
            throw new ArithmeticException("Student is not eligible");// like a statement can be use anywhere
        }
        else{
            System.out.println("Student is eligible");
        }
    }
}
