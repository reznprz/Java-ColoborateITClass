package Class_Definition;

public class Constructors_java {
    String name;

    //creating consturction in java
    //Types of Constructor in java
    //1. Defualt
    //2. NO-arg
    //3. Parameterized




    public Constructors_java(){
        this.name = "Test java constructor!!";
        //any global variable in this class. == this
        //this is incall variable

    }
    public Constructors_java(String name){
        this.name = name;
        System.out.println(name);
        System.out.println("Somecode");
    }

    public static void main(String[] args) {
        Constructors_java obj = new Constructors_java();
        System.out.println(obj.name);

        Constructors_java obj1 = new Constructors_java("Test");
    }
}
