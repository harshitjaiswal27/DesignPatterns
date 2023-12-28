package structural_patterns.bridge_pattern.abstractions;

import structural_patterns.bridge_pattern.implementations.Pizza;

public class ItalianRestaurant extends Restaurant{
    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    public void addToppings() {
        pizza.setToppings("-");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thin");
    }
}
