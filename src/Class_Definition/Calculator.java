package Class_Definition;

public class Calculator {
    //1. global
    //2. non - static

    int numOne;
    int numtwo;

    double numthree;
    double numFour;

    public Calculator(int a, int b){
        System.out.println(a+b);
    }

    public Calculator(double a, double b){
        System.out.println(a * b);
    }
    public Calculator(int a, double b){
        System.out.println(a-b);
    }

    public Calculator(){
        System.out.println("this is no arg constructor");
    }


    public static void main(String[] arg){

        Calculator objOne = new Calculator(4,4);
        Calculator objtwo = new Calculator(4.12,4.99);
        Calculator objthree = new Calculator(2,2.99);

    }
}
