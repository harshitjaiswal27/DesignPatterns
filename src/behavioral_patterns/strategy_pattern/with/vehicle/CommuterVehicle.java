package behavioral_patterns.strategy_pattern.with.vehicle;

import behavioral_patterns.strategy_pattern.with.drive.Drive;

public class CommuterVehicle extends Vehicle {
    public CommuterVehicle(Drive drive) {
        super(drive);
    }
}
