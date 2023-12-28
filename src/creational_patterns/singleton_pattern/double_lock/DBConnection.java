package creational_patterns.singleton_pattern.double_lock;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection(){

    }

    public static DBConnection getInstance(){
        if(dbConnection==null){
            synchronized (DBConnection.class){
                if(dbConnection==null) {
                    System.out.println("Creating new instance");
                    dbConnection = new DBConnection();
                }
            }
        }
        else {
            System.out.println("Serving the existing object");
        }
        return dbConnection;
    }
}