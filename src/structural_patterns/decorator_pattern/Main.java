package structural_patterns.decorator_pattern;

import structural_patterns.decorator_pattern.Pizza.BasePizza;
import structural_patterns.decorator_pattern.Pizza.FarmhousePizza;
import structural_patterns.decorator_pattern.Toppings.ExtraCheeseTopping;
import structural_patterns.decorator_pattern.Toppings.ExtraMushroomTopping;

public class Main {
    public static void main(String[] args) {
        BasePizza pizza = new FarmhousePizza();
        pizza = new ExtraCheeseTopping(pizza);
        System.out.println(pizza.getCost());
        pizza = new ExtraMushroomTopping(pizza);
        System.out.println(pizza.getCost());
    }
}