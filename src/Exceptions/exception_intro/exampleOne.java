package Exceptions.exception_intro;

public class exampleOne {

    public static void main(String[] args) {
        int numOne;
        int numTwo;

        try{
            numOne=0;
           // numTwo= 62/numOne;
            String str = "TT";
            System.out.println(str.charAt(2));
           // System.out.println(numTwo);
            System.out.println("Inside try catch block");
           // System.out.println(numTwo);
            System.out.println("insdie try catch block.. ");

        }
        catch (NullPointerException e){
            System.out.println("String has null value ");
        }
        catch (ArithmeticException e){
            System.out.println("number can not be divided by zero");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("index value is outside of String range");
        }
        catch (Exception e){//Exception class in parent of all child class
            System.out.println("something went wrong ");
        }

        System.out.println("outside of try catch bolock");
    }

}
