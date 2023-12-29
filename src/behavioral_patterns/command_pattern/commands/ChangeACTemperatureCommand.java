package behavioral_patterns.command_pattern.commands;

import behavioral_patterns.command_pattern.receivers.AirConditioner;

public class ChangeACTemperatureCommand implements Command{
    private AirConditioner airConditioner;
    private int temperature;

    public ChangeACTemperatureCommand(AirConditioner airConditioner, int temperature) {
        this.airConditioner = airConditioner;
        this.temperature = temperature;
    }

    @Override
    public void execute() {
        airConditioner.changeTemeperature(temperature);
    }
}
