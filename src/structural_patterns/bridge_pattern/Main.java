package structural_patterns.bridge_pattern;

import structural_patterns.bridge_pattern.abstractions.AmericanRestaurant;
import structural_patterns.bridge_pattern.abstractions.ItalianRestaurant;
import structural_patterns.bridge_pattern.abstractions.Restaurant;
import structural_patterns.bridge_pattern.implementations.PepperoniPizza;
import structural_patterns.bridge_pattern.implementations.VeggiePizza;

public class Main {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();
        System.out.println("---------------------");
        americanRestaurant = new AmericanRestaurant(new VeggiePizza());
        americanRestaurant.deliver();
        System.out.println("---------------------");
        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
