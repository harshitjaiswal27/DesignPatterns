package behavioral_patterns.state_pattern.state;

import behavioral_patterns.state_pattern.ATMMachine;

public class Idle extends ATMState{
    public Idle(ATMMachine atmMachine) {
        super(atmMachine);
    }

    @Override
    public void insertCard() {
        atmMachine.setAtmState(new HasCard(atmMachine));
        System.out.println("Card inserted!");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted!");
    }

    @Override
    public void authenticatePin() {
        System.out.println("Please insert card first!");
    }

    @Override
    public void requestCash() {
        System.out.println("Please insert card first!");
    }
}
