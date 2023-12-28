package creational_patterns.singleton_pattern.synchronized_method;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection(){

    }

    public synchronized static DBConnection getInstance(){
        if(dbConnection==null)
            dbConnection = new DBConnection();
        return dbConnection;
    }
}