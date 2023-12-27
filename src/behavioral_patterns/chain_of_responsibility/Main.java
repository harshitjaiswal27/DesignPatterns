package behavioral_patterns.chain_of_responsibility;

import behavioral_patterns.chain_of_responsibility.handlers.Handler;
import behavioral_patterns.chain_of_responsibility.handlers.ValidatePasswordHandler;
import behavioral_patterns.chain_of_responsibility.handlers.ValidateRoleHandler;
import behavioral_patterns.chain_of_responsibility.handlers.ValidateUserHandler;

public class Main {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        Handler handler = new ValidateUserHandler(dbService);
        handler.setNextHandler(new ValidatePasswordHandler(dbService)).setNextHandler(new ValidateRoleHandler(dbService));
        AuthService authService = new AuthService(handler);
        authService.authenticateUser("harshit", "Harshit@123");
        System.out.println("---------------------------------------------- ");
        authService.authenticateUser("admin", "Admin");
        System.out.println("---------------------------------------------- ");
        authService.authenticateUser("admin", "Admin@123");
    }
}
