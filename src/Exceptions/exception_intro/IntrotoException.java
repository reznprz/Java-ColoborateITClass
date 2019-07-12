package Exceptions.exception_intro;

public class IntrotoException {



    public static void main(String[] args) {

        int numOne = 12;
        int numTwo =0;


        try{
            //possinilities of exception

            System.out.println(numOne/numTwo);
        }
        catch (Exception e){
            System.out.println("thats not possible ");
        }

    }


}
