package Exceptions.exception_intro;

public class Nestedexception {
    public static void main(String[] args) {
        //Main try catch block
        try{

            // second try block
            try{
                //third try block
                try{
                    int arr[] = {1,2,3,4,5};
                    int numone = 10/0;
                    String str = null;

                    System.out.println(arr[10]);

                }
                catch (ArithmeticException e){
                    System.out.println("this is armithithic exception");
                    System.out.println("in third try catch block ... ");
                }

            }catch (ArithmeticException e){
                System.out.println("this is armithithic exception");
                System.out.println("in second try catch block ... ");
            }

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception....");
            System.out.println("In main try-block...");

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array out of the boundry....");
            System.out.println("In main try-block...");

        }
        catch(Exception e){
            System.out.println("something went wrong");
            System.out.println("In main try-block...");
        }
    }
}
