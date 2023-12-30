package behavioral_patterns.visitor_pattern.visitors;

import behavioral_patterns.visitor_pattern.elements.RoomElement;

public class RoomPricingVisitor implements Visitor{
    @Override
    public void visitSingleRoom(RoomElement roomElement) {
        System.out.println("Total cost for Single Room no: "+roomElement.getRoomNumber()+" for "+roomElement.getNights()+" nights is: Rs "+roomElement.getPrice()*roomElement.getNights());
    }

    @Override
    public void visitDoubleRoom(RoomElement roomElement) {
        System.out.println("Total cost for Double Room no: "+roomElement.getRoomNumber()+" for "+roomElement.getNights()+" nights is: Rs "+roomElement.getPrice()*roomElement.getNights());
    }

    @Override
    public void visitDeluxeRoom(RoomElement roomElement) {
        System.out.println("Total cost for Deluxe Room no: "+roomElement.getRoomNumber()+" for "+roomElement.getNights()+" nights is: Rs "+roomElement.getPrice()*roomElement.getNights());
    }
}
