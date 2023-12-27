package creational_patterns.factory_pattern.ocp_followed.factories;

import creational_patterns.factory_pattern.ocp_followed.shapes.Shape;
import creational_patterns.factory_pattern.ocp_followed.shapes.Triangle;

public class TriangleShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Triangle();
    }
}
