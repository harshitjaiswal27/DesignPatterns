package behavioral_patterns.visitor_pattern.elements;

import behavioral_patterns.visitor_pattern.visitors.Visitor;

public abstract class RoomElement {
    private final int price;
    private final int nights;
    private final int roomNumber;

    public int getPrice() {
        return price;
    }

    public int getNights() {
        return nights;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public RoomElement(int price, int nights, int roomNumber) {
        this.price = price;
        this.nights = nights;
        this.roomNumber = roomNumber;
    }
    abstract void accept(Visitor visitor);
}
