package structural_patterns.facade_pattern.thirdparty_complex_services;

public class DatabaseService {

    public User getUser(String userId) {
        return new User("A1", "Geekific", 1000, "USD", "123456LNS");
    }

}