package behavioral_patterns.strategy_pattern.with.drive;

public class NormalDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("You're driving a normal vehicle!");
    }
}
