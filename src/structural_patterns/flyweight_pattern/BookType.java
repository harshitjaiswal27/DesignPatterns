package structural_patterns.flyweight_pattern;

public class BookType {
    private final String type;
    private final String distributor;
    private final String otherData;

    public BookType(String type, String distributor, String otherData) {
        this.type = type;
        this.distributor = distributor;
        this.otherData = otherData;
    }

    @Override
    public String toString() {
        return "BookType{" +
                "type='" + type + '\'' +
                ", distributor='" + distributor + '\'' +
                ", otherData='" + otherData + '\'' +
                '}';
    }
}
