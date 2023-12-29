package behavioral_patterns.command_pattern.receivers;

public class Curtains {
    private boolean open = false;

    public boolean isOpen() {
        return open;
    }

    @Override
    public String toString() {
        return "Curtains{" +
                "open=" + open +
                '}';
    }

    public void openClose(){
        open=!open;
    }
}
