package OOP.Encapsulatio;

public class Car {
    private String carType;
    private String engineType;
    private int price;
    private int noOfwheels;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNoOfwheels() {
        return noOfwheels;
    }

    public void setNoOfwheels(int noOfwheels) {
        this.noOfwheels = noOfwheels;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", engineType='" + engineType + '\'' +
                ", price=" + price +
                ", noOfwheels=" + noOfwheels +
                '}';
    }
}
