package Class_Definition;

public class SaticDemo {
    /*
    1. Static block
    2. Static method
    3. Static variable
     */
    static int num;      // important accessable to the class not the instanece of the class.
    static String str;  // we dont have to create and obj for that or instance.   example SaticDemo.num; but never
    // SaticDemo obj = new SaticDemo(); -------> ((obj.str; NO ))

    static {
        num = 60;
        str = "Test Static Block";
    }

    static {
        //always initialize the first
        num = 55;
        str = "test static Block";
    }
    static void myMethod(){
        System.out.println("this is my method .. ");
    }

    public static void main(String[] args){
        myMethod();
        System.out.println("value of num " + num);
        System.out.println("value of num " + str);

    }

}
