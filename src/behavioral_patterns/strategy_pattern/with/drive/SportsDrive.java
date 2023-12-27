package behavioral_patterns.strategy_pattern.with.drive;

public class SportsDrive implements Drive{
    @Override
    public void drive() {
        System.out.println("You're driving a super vehicle!");
    }
}
