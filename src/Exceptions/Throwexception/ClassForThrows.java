package Exceptions.Throwexception;

import java.io.IOException;

public class ClassForThrows {

    public static void main(String[] args) {

        ThrowExampleDemo demo = new ThrowExampleDemo();


        try{
            demo.myMethod(4);
        }
        catch (IOException e){
            System.out.println("this is an IOException");
        }
        catch (ClassNotFoundException e){
            System.out.println("class not found exception");

        }

    }





}
class ThrowExampleDemo{


    public void myMethod(int num) throws IOException,ClassNotFoundException{
        if(num==1){
            throw new IOException("this is an IOException");
        }
        else {
            throw new ClassNotFoundException("class not found exception");
        }
    }
}
