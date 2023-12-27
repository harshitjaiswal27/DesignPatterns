package creational_patterns.abstract_factory_pattern.factories;

import creational_patterns.abstract_factory_pattern.components.Gpu;
import creational_patterns.abstract_factory_pattern.components.Monitor;
import creational_patterns.abstract_factory_pattern.components.MsiGpu;
import creational_patterns.abstract_factory_pattern.components.MsiMonitor;

public class MsiComponentFactory implements ComponentFactory{
    @Override
    public Gpu createGpu() {
        return new MsiGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new MsiMonitor();
    }
}
