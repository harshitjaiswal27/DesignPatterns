package creational_patterns.factory_pattern.ocp_violated;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("This is Square");
    }
}
