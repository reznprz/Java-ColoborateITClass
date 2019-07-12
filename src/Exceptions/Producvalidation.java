package Exceptions;

public class Producvalidation {

        public void productCheck(int weight) throws InvalidProductException{

        if(weight < 100){
           throw new InvalidProductException("Product invalid");
        }

    }

    public static void main(String[] args) throws InvalidProductException {
        Producvalidation validation = new Producvalidation();

        try {
            validation.productCheck(60);
            System.out.println("VALID....");
        } catch (InvalidProductException e) {  //ASK ASK ASK
            System.out.println("catch the exception ");
            System.out.println(e.getMessage());
        }
    }
}

class InvalidProductException extends Exception{

    public InvalidProductException(String str) {
            //calling the constructor from parent or super class.
            super(str);
        //super constructor form another another
       // cannot called constructor from method
    }
}
