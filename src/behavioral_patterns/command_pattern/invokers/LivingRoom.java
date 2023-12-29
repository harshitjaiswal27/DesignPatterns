package behavioral_patterns.command_pattern.invokers;

import behavioral_patterns.command_pattern.receivers.AirConditioner;
import behavioral_patterns.command_pattern.receivers.Curtains;
import behavioral_patterns.command_pattern.receivers.Light;

public class LivingRoom extends Room{
    private final Light light = new Light();
    private final AirConditioner airConditioner = new AirConditioner();
    private final Curtains curtains = new Curtains();

    public Light getLight() {
        return light;
    }

    public AirConditioner getAirConditioner() {
        return airConditioner;
    }

    public Curtains getCurtains() {
        return curtains;
    }

    @Override
    public String toString() {
        return "LivingRoom{" +
                "light=" + light +
                ", airConditioner=" + airConditioner +
                ", curtains=" + curtains +
                '}';
    }
}
