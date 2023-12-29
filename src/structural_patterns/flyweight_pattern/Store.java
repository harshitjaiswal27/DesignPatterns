package structural_patterns.flyweight_pattern;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private final List<Book> books = new ArrayList<>();
    public void storeBook(String name, double price, String type, String distributor, String otherData){
        books.add(new Book(name,price,BookFactory.getBookType(type,distributor,otherData)));
    }
    public void displayBooks(){
        books.forEach(System.out::println);
    }
}
