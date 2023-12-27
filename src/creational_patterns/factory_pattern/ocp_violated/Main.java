package creational_patterns.factory_pattern.ocp_violated;

public class Main {
    public static void main(String[] args) {
        Shape shape = ShapeFactory.getShape(ShapeEnum.Square);
        shape.draw();
    }
}