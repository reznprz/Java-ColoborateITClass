package OOP.Abstraction;

public class Abstraction_demo extends Demotest{
    @Override
    void myMethod() {
        System.out.println(" this is override method...");
    }

    public static void main(String[] args) {
        Abstraction_demo demo = new Abstraction_demo();
        demo.myMethod();
    }
}
abstract class  Demotest{
    //you cannot create instance of an abstract class.
    //can have method also as abstract method.
    //all abstract methods are by defult by public.....
    //all abstract methods must be override by  child class.
    //you are not allowed to have body in abstract method.

    abstract void myMethod();

}