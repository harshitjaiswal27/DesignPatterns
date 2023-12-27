package structural_patterns.decorator_pattern.Pizza;

public class FarmhousePizza extends BasePizza{
    @Override
    public int getCost() {
        return 200;
    }
}
