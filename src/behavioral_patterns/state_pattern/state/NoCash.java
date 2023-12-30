package behavioral_patterns.state_pattern.state;

import behavioral_patterns.state_pattern.ATMMachine;

public class NoCash extends ATMState{
    public NoCash(ATMMachine atmMachine) {
        super(atmMachine);
    }

    @Override
    public void insertCard() {
        System.out.println("Cash not available!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Cash not available!");
    }

    @Override
    public void authenticatePin() {
        System.out.println("Cash not available!");
    }

    @Override
    public void requestCash() {
        System.out.println("Cash not available!");
    }
}
