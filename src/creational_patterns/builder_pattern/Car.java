package creational_patterns.builder_pattern;

public class Car {
    private final int id;
    private final String brand;
    private final String model;
    private final String color;
    private final int nbrDoors;
    private final String engine;
    private final int height;

    Car(int id, String brand, String model, String color, int nbrDoors, String engine, int height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.nbrDoors = nbrDoors;
        this.engine = engine;
        this.height = height;
    }
    public void displayAttributes(){
        System.out.println("Id: "+id);
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Number of Doors: "+nbrDoors);
        System.out.println("Engine: "+engine);
        System.out.println("Height: "+height);
    }
}
