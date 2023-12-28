package creational_patterns.prototype_pattern;

public class Bus implements VehiclePrototype{
    private String brand;
    private String model;
    private int seats;

    public Bus(String brand, String model, int seats) {
        this.brand = brand;
        this.model = model;
        this.seats = seats;
    }
    public Bus(Bus bus) {
        this.brand = bus.brand;
        this.model = bus.model;
        this.seats = bus.seats;
    }
    @Override
    public VehiclePrototype clone() {
        return new Bus(this);
    }
}
