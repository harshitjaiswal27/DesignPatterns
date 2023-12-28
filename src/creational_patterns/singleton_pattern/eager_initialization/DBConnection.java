package creational_patterns.singleton_pattern.eager_initialization;

public class DBConnection {
    private static final DBConnection dbConnection = new DBConnection();

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        return dbConnection;
    }
}
