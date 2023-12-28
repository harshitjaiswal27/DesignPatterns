package structural_patterns.composite_pattern;

import java.util.List;

public class CompositeBox implements Box{
    private final List<Box> children;

    public CompositeBox(List<Box> children) {
        this.children = children;
    }

    @Override
    public double calculatePrice() {
        double sum = 0;
        for(Box box: children)
            sum+=box.calculatePrice();
        return sum;
    }
}
