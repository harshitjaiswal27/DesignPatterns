package creational_patterns.abstract_factory_pattern.factories;

import creational_patterns.abstract_factory_pattern.components.Gpu;
import creational_patterns.abstract_factory_pattern.components.Monitor;

public interface ComponentFactory {
    Gpu createGpu();
    Monitor createMonitor();
}
