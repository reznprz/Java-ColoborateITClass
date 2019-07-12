package Operators.Instanceof_keyword;

public class instanceof_keyword {

    public static void main(String[] args) {

        String s = "Hello";
        if(s instanceof java.lang.String){
            System.out.println("is a String");
        }
        //However, applying instance of a null reference varibale return false.
        //for examples, the following if statement returns false;

        String o = null;
        if(o instanceof java.lang.String){
            System.out.println("true");

        }else {
            System.out.println("false");
        }

    }
}
