package behavioral_patterns.state_pattern.state;

import behavioral_patterns.state_pattern.ATMMachine;

import java.util.Scanner;

public class HasCard extends ATMState{
    public HasCard(ATMMachine atmMachine) {
        super(atmMachine);
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Your card is ejected!");
        atmMachine.setAtmState(new Idle(atmMachine));
    }

    @Override
    public void authenticatePin() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("PIN: ");
        int pin = sc.nextInt();
        if(pin==1234){
            System.out.println("Pin Validated!");
            atmMachine.setCorrectPinEntered(true);
            atmMachine.setAtmState(new HasPin(atmMachine));
        }
        else{
            System.out.println("You entered a wrong pin!");
            atmMachine.setCorrectPinEntered(false);
            System.out.println("Your card is ejected");
            atmMachine.setAtmState(new Idle(atmMachine));
        }
    }

    @Override
    public void requestCash() {
        System.out.println("Please enter pin first");
    }
}
