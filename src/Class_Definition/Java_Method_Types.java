package Class_Definition;

public class Java_Method_Types {
    //Method/function in class.
    //Type of Method/Function in java
    //1. Static vs non-static
    //2. void vs non-void
    //3. with parameter or without parameter.

    public static void main(String[] args) {
       // o.getRefA();
        //calling the constructor in java
        //type of method that doesnt jave static or non static is always the same as class name
        Java_Method_Types x = new Java_Method_Types();
        x.getRefA();
        geRefB();
    }
    //1. Static vs non-static
    //Static method are only allowed to call via another static method.

    public  void getRefA(){
        System.out.println("this is A ");
    }
    public static  void geRefB(){
        Java_Method_Types x = new Java_Method_Types();
        x.getRefA();
    }
    public void getinfo(){
        System.out.println("this is not static method..");
    }
    //class consturctor
    //1. it will always be same as name of class name.
    //2. never be static or non-static
    //3. never be void or return type..
    //4. with args and without args.
    public Java_Method_Types(){
        System.out.println("this is constructor....");
    }
}
