package creational_patterns.singleton_pattern;

import creational_patterns.singleton_pattern.double_lock.DBConnection;

public class Main {
    public static void main(String[] args) {
        DBConnection.getInstance();
        DBConnection.getInstance();
        DBConnection.getInstance();
    }
}
