package behavioral_patterns.visitor_pattern.visitors;

import behavioral_patterns.visitor_pattern.elements.RoomElement;

public class RoomMaintainenceVisitor implements Visitor{
    @Override
    public void visitSingleRoom(RoomElement roomElement) {
        System.out.println("Maintenance work is going on for Single Room no: "+roomElement.getRoomNumber());
    }

    @Override
    public void visitDoubleRoom(RoomElement roomElement) {
        System.out.println("Maintenance work is going on for Double Room no: "+roomElement.getRoomNumber());
    }

    @Override
    public void visitDeluxeRoom(RoomElement roomElement) {
        System.out.println("Maintenance work is going on for Deluxe Room no: "+roomElement.getRoomNumber());
    }
}
