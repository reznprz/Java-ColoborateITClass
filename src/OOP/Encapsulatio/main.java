package OOP.Encapsulatio;

public class main {
    public static void main(String[] args) {
        Car c1 = new Car();


        c1.setPrice(2000);
        c1.setCarType("hyundai");
        c1.setEngineType("v4");
        c1.setNoOfwheels(4);

        Car c2 = new Car();
        c2.setPrice(8000);
        c2.setCarType("Kia");
        c2.setEngineType("v6");
        c2.setNoOfwheels(4);

        Car c3 = new Car();
        c2.setPrice(11000);
        c2.setCarType("ford");
        c2.setEngineType("v12");
        c2.setNoOfwheels(4);

        getCar("VAN", "V6", 4,25000);



    }

    public static Car getCar(String type, String enginetype, int w, int p){
        Car car = new Car();
        car.setCarType(type);
        car.setNoOfwheels(w);
        car.setPrice(p);
        car.setEngineType(enginetype);
        System.out.println(car);
        return car;
    }
}
