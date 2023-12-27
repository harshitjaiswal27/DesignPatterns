package creational_patterns.abstract_factory_pattern.components;

public class MsiMonitor implements Monitor{
    @Override
    public void assemble() {
        System.out.println("Assembling MSI Monitor");
    }
}
