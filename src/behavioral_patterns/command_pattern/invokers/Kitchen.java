package behavioral_patterns.command_pattern.invokers;

import behavioral_patterns.command_pattern.receivers.Light;

public class Kitchen extends Room{
    private Light light = new Light();

    public Light getLight() {
        return light;
    }

    @Override
    public String toString() {
        return "Kitchen{" +
                "light=" + light +
                '}';
    }
}
