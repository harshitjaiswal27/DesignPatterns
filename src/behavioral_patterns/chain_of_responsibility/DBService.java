package behavioral_patterns.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

public class DBService {
    private final Map<String,String> db;

    public DBService(){
        db = new HashMap<>();
        db.put("harshit", "Harshit@123");
        db.put("admin", "Admin@123");
    }

    public boolean isValidUser(String user){
        return db.containsKey(user);
    }

    public boolean isValidPassword(String user, String password){
        return db.get(user).equals(password);
    }

    public boolean isAdmin(String user){
        return user.equals("admin");
    }
}
