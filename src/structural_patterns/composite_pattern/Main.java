package structural_patterns.composite_pattern;

import structural_patterns.composite_pattern.products.Book;
import structural_patterns.composite_pattern.products.VideoGame;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CompositeBox box = new CompositeBox(Arrays.asList(
                new VideoGame("GTA5",10000),
                new Book("Head First Design Pattern", 500),
                new CompositeBox(Arrays.asList(
                        new CompositeBox(Arrays.asList(
                                new Book("Let us C", 200)
                        )),
                        new VideoGame("NFS", 5000),
                        new Book("System Design Interview", 400)
                ))
        ));
        DeliveryService deliveryService = new DeliveryService(box);
        System.out.println("Total Cost is: "+deliveryService.calculatePrice());
    }
}
