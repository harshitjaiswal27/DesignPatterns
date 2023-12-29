package behavioral_patterns.command_pattern;

import behavioral_patterns.command_pattern.commands.ChangeACTemperatureCommand;
import behavioral_patterns.command_pattern.commands.OpenCloseCurtainsCommand;
import behavioral_patterns.command_pattern.commands.SwitchACCommand;
import behavioral_patterns.command_pattern.commands.SwitchLightsCommand;
import behavioral_patterns.command_pattern.invokers.Kitchen;
import behavioral_patterns.command_pattern.invokers.LivingRoom;

public class Home {
    public static void main(String[] args) {
        LivingRoom livingRoom = new LivingRoom();
        System.out.println(livingRoom.toString());
        livingRoom.setCommand(new SwitchLightsCommand(livingRoom.getLight()));
        livingRoom.executeCommand();
        System.out.println(livingRoom.toString());
        livingRoom.setCommand(new SwitchACCommand(livingRoom.getAirConditioner()));
        livingRoom.executeCommand();
        System.out.println(livingRoom.toString());
        livingRoom.setCommand(new ChangeACTemperatureCommand(livingRoom.getAirConditioner(),20));
        livingRoom.executeCommand();
        System.out.println(livingRoom.toString());
        livingRoom.setCommand(new OpenCloseCurtainsCommand(livingRoom.getCurtains()));
        livingRoom.executeCommand();
        System.out.println(livingRoom.toString());
        livingRoom.setCommand(new OpenCloseCurtainsCommand(livingRoom.getCurtains()));
        livingRoom.executeCommand();
        System.out.println(livingRoom.toString());
        System.out.println("==================================================================================================");
        Kitchen kitchen = new Kitchen();
        System.out.println(kitchen.toString());
        kitchen.setCommand(new SwitchLightsCommand(kitchen.getLight()));
        kitchen.executeCommand();
        System.out.println(kitchen.toString());
    }
}
