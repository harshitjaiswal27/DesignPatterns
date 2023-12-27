package behavioral_patterns.strategy_pattern.without;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle();
        vehicle.drive();
        vehicle = new CommuterVehicle();
        vehicle.drive();
    }
}
