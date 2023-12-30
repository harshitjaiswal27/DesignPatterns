package behavioral_patterns.visitor_pattern.visitors;

import behavioral_patterns.visitor_pattern.elements.RoomElement;

public interface Visitor {
    void visitSingleRoom(RoomElement roomElement);
    void visitDoubleRoom(RoomElement roomElement);
    void visitDeluxeRoom(RoomElement roomElement);
}
