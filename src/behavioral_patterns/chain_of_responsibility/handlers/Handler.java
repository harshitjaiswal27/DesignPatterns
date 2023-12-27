package behavioral_patterns.chain_of_responsibility.handlers;

public abstract class Handler {
    private Handler nextHandler;

    public abstract boolean handle(String user, String password);

    public boolean handleNext(String user, String password){
        if(nextHandler!=null){
            return nextHandler.handle(user,password);
        }
        else {
            return true;
        }
    }

    public Handler setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
        return nextHandler;
    }
}
