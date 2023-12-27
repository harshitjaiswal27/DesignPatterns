package structural_patterns.decorator_pattern.Toppings;


import structural_patterns.decorator_pattern.Pizza.BasePizza;

public class ExtraCheeseTopping extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int getCost() {
        return basePizza.getCost()+25;
    }
}
