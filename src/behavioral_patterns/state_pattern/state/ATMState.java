package behavioral_patterns.state_pattern.state;

import behavioral_patterns.state_pattern.ATMMachine;

public abstract class ATMState {
    protected ATMMachine atmMachine;

    public ATMState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    public abstract void insertCard();
    public abstract void ejectCard();
    public abstract void authenticatePin();
    public abstract void requestCash();
}
