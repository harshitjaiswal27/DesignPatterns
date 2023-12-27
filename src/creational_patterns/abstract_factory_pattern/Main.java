package creational_patterns.abstract_factory_pattern;

import creational_patterns.abstract_factory_pattern.components.Gpu;
import creational_patterns.abstract_factory_pattern.components.Monitor;
import creational_patterns.abstract_factory_pattern.factories.AsusComponentFactory;
import creational_patterns.abstract_factory_pattern.factories.ComponentFactory;
import creational_patterns.abstract_factory_pattern.factories.MsiComponentFactory;

public class Main {
    public static void main(String[] args){
        ComponentFactory asusComponentFactory = new AsusComponentFactory();
        ComponentFactory msiComponentFactory = new MsiComponentFactory();
        Gpu asusGpu = asusComponentFactory.createGpu();
        Monitor msiMonitor = msiComponentFactory.createMonitor();
        asusGpu.assemble();
        msiMonitor.assemble();
    }
}