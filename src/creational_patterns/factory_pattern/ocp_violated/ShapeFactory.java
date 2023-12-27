package creational_patterns.factory_pattern.ocp_violated;

public class ShapeFactory {

    //This violates the Open-Closed Principle. If we want to introduce a new object type in future
    public static Shape getShape(ShapeEnum shapeEnum){
        switch (shapeEnum) {
            case Circle -> {
                return new Circle();
            }
            case Square -> {
                return new Square();
            }
            default -> throw new IllegalArgumentException();
        }
    }
}
