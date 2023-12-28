package creational_patterns.prototype_pattern;

public class Car implements VehiclePrototype{
    private String brand;
    private String model;
    private String color;
    private int price;

    public Car(String brand, String model, String color, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public Car(Car car) {
        this.brand = car.brand;
        this.model = car.model;
        this.color = car.color;
        this.price = car.price;
    }

    @Override
    public VehiclePrototype clone() {
        return new Car(this);
    }
}
