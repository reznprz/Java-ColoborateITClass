package OOP.Abstraction;

public class Zoo {

    public static void main(String[] args) {

        Animal dog = new dog();
        dog.move();
        dog.run();
        dog.swim();

        Animal horse = new Horse();
        horse.swim();
        horse.run();
        horse.move();

    }

}

abstract class Animal{

    abstract void move();
    abstract  void run();
    abstract  void swim();
}

abstract class mamal extends Animal{



    abstract void walk();
}



class dog extends mamal{
    @Override
    void move() {

    }

    @Override
    void run() {

    }

    @Override
    void swim() {

    }

    @Override // since it extends the mamal class.
    void walk() {

    }
}

class  Horse extends Animal{
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    void move() {

    }

    @Override
    void run() {

    }

    @Override
    void swim() {

    }
}