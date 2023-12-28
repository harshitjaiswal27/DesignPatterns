package structural_patterns.composite_pattern;

public class DeliveryService {
    Box box;

    public DeliveryService(Box box) {
        this.box = box;
    }
    public double calculatePrice(){
        return box.calculatePrice();
    }
}
