package behavioral_patterns.command_pattern.commands;

import behavioral_patterns.command_pattern.receivers.Light;

public class SwitchLightsCommand implements Command{
    private Light light;

    public SwitchLightsCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.switchLights();
    }
}
