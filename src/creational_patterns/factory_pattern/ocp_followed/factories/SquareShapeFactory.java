package creational_patterns.factory_pattern.ocp_followed.factories;

import creational_patterns.factory_pattern.ocp_followed.shapes.Shape;
import creational_patterns.factory_pattern.ocp_followed.shapes.Square;

public class SquareShapeFactory implements ShapeFactory{
    @Override
    public Shape getShape() {
        return new Square();
    }
}
