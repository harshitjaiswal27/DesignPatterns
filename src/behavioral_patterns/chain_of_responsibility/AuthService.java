package behavioral_patterns.chain_of_responsibility;

import behavioral_patterns.chain_of_responsibility.handlers.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public void authenticateUser(String user, String password){
        if(!handler.handleNext(user,password)){
            System.out.printf("Redirecting user %s to Login Screen!%n", user);
            return;
        }
        System.out.printf("Loading Dashboard for user %s!%n", user);
    }
}
