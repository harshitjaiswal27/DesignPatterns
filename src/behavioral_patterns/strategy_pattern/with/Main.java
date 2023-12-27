package behavioral_patterns.strategy_pattern.with;

import behavioral_patterns.strategy_pattern.with.drive.NormalDrive;
import behavioral_patterns.strategy_pattern.with.drive.SportsDrive;
import behavioral_patterns.strategy_pattern.with.vehicle.CommuterVehicle;
import behavioral_patterns.strategy_pattern.with.vehicle.SportVehicle;
import behavioral_patterns.strategy_pattern.with.vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SportVehicle(new SportsDrive());
        vehicle.drive();
        vehicle = new CommuterVehicle(new NormalDrive());
        vehicle.drive();
    }
}
