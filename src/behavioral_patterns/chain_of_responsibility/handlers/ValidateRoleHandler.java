package behavioral_patterns.chain_of_responsibility.handlers;

import behavioral_patterns.chain_of_responsibility.DBService;

public class ValidateRoleHandler extends Handler{
    private final DBService dbService;

    public ValidateRoleHandler(DBService dbService) {
        this.dbService = dbService;
    }

    @Override
    public boolean handle(String user, String password) {
        if(dbService.isAdmin(user)){
            System.out.println("Loading Admin Page");
            return true;
        }
        return handleNext(user,password);
    }
}
