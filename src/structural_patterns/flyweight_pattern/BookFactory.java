package structural_patterns.flyweight_pattern;

import java.util.HashMap;
import java.util.Map;

public class BookFactory {
    private static final Map<String, BookType> types = new HashMap<>();

    public static BookType getBookType(String type, String distributor, String otherData){
        if(!types.containsKey(type)){
            types.put(type, new BookType(type,distributor,otherData));
        }
        return types.get(type);
    }
}
