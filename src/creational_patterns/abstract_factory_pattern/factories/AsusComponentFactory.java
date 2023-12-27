package creational_patterns.abstract_factory_pattern.factories;

import creational_patterns.abstract_factory_pattern.components.AsusGpu;
import creational_patterns.abstract_factory_pattern.components.AsusMonitor;
import creational_patterns.abstract_factory_pattern.components.Gpu;
import creational_patterns.abstract_factory_pattern.components.Monitor;

public class AsusComponentFactory implements ComponentFactory{
    @Override
    public Gpu createGpu() {
        return new AsusGpu();
    }

    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }
}
