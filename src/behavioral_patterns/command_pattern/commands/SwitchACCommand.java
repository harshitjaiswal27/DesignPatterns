package behavioral_patterns.command_pattern.commands;

import behavioral_patterns.command_pattern.receivers.AirConditioner;

public class SwitchACCommand implements Command{
    private AirConditioner airConditioner;

    public SwitchACCommand(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void execute() {
        airConditioner.switchAC();
    }
}
