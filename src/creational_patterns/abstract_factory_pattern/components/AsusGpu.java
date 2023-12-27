package creational_patterns.abstract_factory_pattern.components;

public class AsusGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling Asus GPU");
    }
}
