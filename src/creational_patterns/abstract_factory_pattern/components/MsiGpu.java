package creational_patterns.abstract_factory_pattern.components;

public class MsiGpu implements Gpu{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI GPU");
    }
}
