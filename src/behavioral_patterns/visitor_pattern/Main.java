package behavioral_patterns.visitor_pattern;

import behavioral_patterns.visitor_pattern.elements.DeluxeRoom;
import behavioral_patterns.visitor_pattern.elements.DoubleRoom;
import behavioral_patterns.visitor_pattern.elements.SingleRoom;
import behavioral_patterns.visitor_pattern.visitors.RoomMaintainenceVisitor;
import behavioral_patterns.visitor_pattern.visitors.RoomPricingVisitor;

public class Main {
    public static void main(String[] args) {
        SingleRoom singleRoom = new SingleRoom(2000,2, 101);
        DoubleRoom doubleRoom = new DoubleRoom(3500,3, 105);
        DeluxeRoom deluxeRoom = new DeluxeRoom(5000,1, 110);
        DeluxeRoom deluxeRoom1 = new DeluxeRoom(5000,2, 111);
        singleRoom.accept(new RoomMaintainenceVisitor());
        doubleRoom.accept(new RoomPricingVisitor());
        deluxeRoom.accept(new RoomMaintainenceVisitor());
        deluxeRoom.accept(new RoomPricingVisitor());
        deluxeRoom1.accept(new RoomMaintainenceVisitor());
        deluxeRoom1.accept(new RoomPricingVisitor());
    }
}
