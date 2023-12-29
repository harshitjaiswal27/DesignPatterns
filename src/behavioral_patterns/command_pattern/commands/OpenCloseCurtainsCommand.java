package behavioral_patterns.command_pattern.commands;

import behavioral_patterns.command_pattern.receivers.Curtains;

public class OpenCloseCurtainsCommand implements Command{
    private Curtains curtains;

    public OpenCloseCurtainsCommand(Curtains curtains) {
        this.curtains = curtains;
    }

    @Override
    public void execute() {
        curtains.openClose();
    }
}
