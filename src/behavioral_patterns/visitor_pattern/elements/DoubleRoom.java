package behavioral_patterns.visitor_pattern.elements;

import behavioral_patterns.visitor_pattern.visitors.Visitor;

public class DoubleRoom extends RoomElement{
    public DoubleRoom(int price, int nights, int roomNumber) {
        super(price, nights, roomNumber);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitDoubleRoom(this);
    }
}
