package creational_patterns.factory_pattern.ocp_followed.factories;

import creational_patterns.factory_pattern.ocp_followed.shapes.Circle;
import creational_patterns.factory_pattern.ocp_followed.shapes.Shape;

public class CircleShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Circle();
    }
}
