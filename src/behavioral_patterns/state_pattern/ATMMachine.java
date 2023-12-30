package behavioral_patterns.state_pattern;

import behavioral_patterns.state_pattern.state.ATMState;
import behavioral_patterns.state_pattern.state.Idle;
import behavioral_patterns.state_pattern.state.NoCash;

public class ATMMachine {
    private ATMState atmState;
    private int availableCash;
    private boolean correctPinEntered = false;
    public ATMMachine(int availableCash) {
        this.availableCash = availableCash;
        if(availableCash<0)
            this.atmState = new NoCash(this);
        else
            this.atmState = new Idle(this);
    }
    public void setAvailableCash(int availableCash) {
        this.availableCash = availableCash;
    }
    public void setCorrectPinEntered(boolean correctPinEntered) {
        this.correctPinEntered = correctPinEntered;
    }
    public int getAvailableCash() {
        return availableCash;
    }
    public boolean isCorrectPinEntered() {
        return correctPinEntered;
    }
    public void setAtmState(ATMState atmState){
        this.atmState = atmState;
    }
    public void insertCard(){
        atmState.insertCard();
    }
    public void ejectCard(){
        atmState.ejectCard();
    }
    public void authenticatePin(){
        atmState.authenticatePin();
    }
    public void requestCash(){
        atmState.requestCash();
    }
}
