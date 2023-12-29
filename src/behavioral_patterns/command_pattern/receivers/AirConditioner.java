package behavioral_patterns.command_pattern.receivers;

public class AirConditioner {
    private boolean switchedOn = false;
    private int temperature = 24;
    public void switchAC(){
        switchedOn = !switchedOn;
    }
    public void changeTemeperature(int temperature){
        this.temperature = temperature;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "AirConditioner{" +
                "switchedOn=" + switchedOn +
                ", temperature=" + temperature +
                '}';
    }
}
