package creational_patterns.prototype_pattern;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<VehiclePrototype> list = new ArrayList<>(){{
            add(new Car("Tata","Harrier","Black",1500000));
            add(new Car("Suzuki","Breeza","White",1600000));
            add(new Bus("Mercedes","Setra",30));
        }};
        list.addAll(Main.cloneList(list));
        for(VehiclePrototype vehiclePrototype:list)
            System.out.println(vehiclePrototype.hashCode());
    }

    public static List<VehiclePrototype> cloneList(List<VehiclePrototype> vehicles){
        List<VehiclePrototype> vehiclePrototypes = new ArrayList<>();
        for(VehiclePrototype vehiclePrototype:vehicles){
            vehiclePrototypes.add(vehiclePrototype.clone());
        }
        return vehiclePrototypes;
    }
}
