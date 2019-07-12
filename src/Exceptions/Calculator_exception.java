package Exceptions;

public class Calculator_exception {

    public void CalculatorCheck(int input1, int input2) throws InvalidCalculatorexpression{
        int i=0;

//        if(input1 + input2 == i ){
//            throw new InvalidCalculatorexpression("Caculator invalid");
//        }







    }

    public static void main(String[] args) {
        Calculator_exception c = new Calculator_exception();
        try {
            c.CalculatorCheck(2,6);
            System.out.println("VALID....");
        } catch (InvalidCalculatorexpression e) {

            System.out.println("catch the exception ");
            System.out.println(e.getMessage());
        }
    }

}


class InvalidCalculatorexpression extends Exception {

    public InvalidCalculatorexpression(String str) {
        super(str);
    }


}
