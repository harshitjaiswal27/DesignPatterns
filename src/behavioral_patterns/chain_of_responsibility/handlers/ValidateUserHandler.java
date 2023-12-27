package behavioral_patterns.chain_of_responsibility.handlers;

import behavioral_patterns.chain_of_responsibility.DBService;

public class ValidateUserHandler extends Handler{
    private final DBService dbService;

    public ValidateUserHandler(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public boolean handle(String user, String password) {
        if(!dbService.isValidUser(user)){
            System.out.println("Invalid User");
            return false;
        }
        return handleNext(user,password);
    }
}
