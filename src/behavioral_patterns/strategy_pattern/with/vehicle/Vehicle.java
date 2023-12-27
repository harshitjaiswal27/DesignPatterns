package behavioral_patterns.strategy_pattern.with.vehicle;

import behavioral_patterns.strategy_pattern.with.drive.Drive;

public class Vehicle {
    Drive drive;
    Vehicle(Drive drive){
        this.drive = drive;
    }
    public void drive(){
        drive.drive();
    }
}
