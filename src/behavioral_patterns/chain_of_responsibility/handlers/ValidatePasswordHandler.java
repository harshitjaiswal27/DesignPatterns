package behavioral_patterns.chain_of_responsibility.handlers;

import behavioral_patterns.chain_of_responsibility.DBService;

public class ValidatePasswordHandler extends Handler{
    private final DBService dbService;

    public ValidatePasswordHandler(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public boolean handle(String user, String password) {
        if(!dbService.isValidPassword(user,password)){
            System.out.println("Invalid User");
            return false;
        }
        return handleNext(user, password);
    }
}
