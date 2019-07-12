package OOP.Inheritance;

public class Inheritance_test {

    public static void main(String[] args) {
        MountainBike bike = new MountainBike(2,4,9);
        bike.setHeight(5);
    }
}

class Bicycle{
    int gear;
    int speed;
    int i;

    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}

class MountainBike extends Bicycle {
    int seatHeight;

    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;

        System.out.println("Gear " +gear +"\n" + "speed" + speed + "\n" );
    }

    public void setHeight(int value){
        this.seatHeight = value;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                '}';
    }
}