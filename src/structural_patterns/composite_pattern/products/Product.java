package structural_patterns.composite_pattern.products;

import structural_patterns.composite_pattern.Box;

public abstract class Product implements Box {
    protected final String title;
    protected final double price;
    public Product(String title, double price) {
        this.title = title;
        this.price = price;
    }
}
