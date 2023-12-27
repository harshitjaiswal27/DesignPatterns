package structural_patterns.decorator_pattern.Toppings;

import structural_patterns.decorator_pattern.Pizza.BasePizza;

public class ExtraMushroomTopping extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraMushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+40;
    }
}
