package creational_patterns.factory_pattern.ocp_followed;

import creational_patterns.factory_pattern.ocp_followed.factories.CircleShapeFactory;
import creational_patterns.factory_pattern.ocp_followed.factories.ShapeFactory;
import creational_patterns.factory_pattern.ocp_followed.factories.SquareShapeFactory;
import creational_patterns.factory_pattern.ocp_followed.factories.TriangleShapeFactory;
import creational_patterns.factory_pattern.ocp_followed.shapes.Shape;

public class Main {
    public static void main(String[] args) {
        ShapeFactory circleShapeFactory = new CircleShapeFactory();
        ShapeFactory squareShapeFactory = new SquareShapeFactory();
        ShapeFactory triangleShapeFactory = new TriangleShapeFactory();
        Shape circle = circleShapeFactory.getShape();
        Shape square = squareShapeFactory.getShape();
        Shape triangle = triangleShapeFactory.getShape();
        circle.draw();
        square.draw();
        triangle.draw();
    }
}