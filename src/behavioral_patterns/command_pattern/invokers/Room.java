package behavioral_patterns.command_pattern.invokers;

import behavioral_patterns.command_pattern.commands.Command;

public abstract class Room {
    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
