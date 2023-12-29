package behavioral_patterns.command_pattern.receivers;

public class Light {
    private boolean switchedOn = false;

    @Override
    public String toString() {
        return "Light{" +
                "switchedOn=" + switchedOn +
                '}';
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void switchLights(){
        switchedOn = !switchedOn;
    }
}
