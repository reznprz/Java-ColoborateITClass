package OOP.Inheritance;

public class Demotest {

    public static void main(String[] args) {

        //Animal c1 = new Animal(22,4444,"cat1", 4);
//        Dog d = new Dog(22,33,"d1",5);
//        d.move();
//        Animal a1 = new Animal();
//        a1.move();
//
//
        Animal out = new Animal();

        Dog d1 = new Dog(2,4,"gg");
        d1.Print();
        Animal v1 = new Dog(2,4,"gg");
        v1.move();/// asked milan




    }
}

class Animal {

    int age;
    int runSpeed;
    String name;

    public Animal(){

    }

    public Animal(int age, int runSpeed, String name) {
        this.age = age;
        this.runSpeed = runSpeed;
        this.name = name;
    }

    static void move(){
        System.out.println("this is void of Parent class Animal");
    }
}

class Cat extends Animal {

    public Cat(int age, int runSpeed, String name) {
        super(age, runSpeed, name);
    }
}

class Dog extends Cat{

    int sound;

    public Dog(int age, int runSpeed, String name, int sound) {
        super(age, runSpeed, name);
        this.sound = sound;
    }

    public Dog(int age, int runSpeed, String name) {
        super(age, runSpeed, name);
    }

    void Print(){
        System.out.println("this is print method of class Dog");
    }

}
