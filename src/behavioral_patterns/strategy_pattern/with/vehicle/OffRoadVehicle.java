package behavioral_patterns.strategy_pattern.with.vehicle;

import behavioral_patterns.strategy_pattern.with.drive.Drive;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle(Drive drive) {
        super(drive);
    }
}
