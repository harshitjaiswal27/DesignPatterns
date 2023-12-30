package behavioral_patterns.state_pattern.state;

import behavioral_patterns.state_pattern.ATMMachine;

import java.util.Scanner;

public class HasPin extends ATMState{
    public HasPin(ATMMachine atmMachine) {
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
        System.out.println("Pin already entered!");
    }

    @Override
    public void requestCash() {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Amount: ");
        int amount = sc.nextInt();
        if(amount>atmMachine.getAvailableCash()){
            System.out.println("Entered amount not available currently, Please try with a lower amount!");
        }
        else{
            System.out.println("Amount "+amount+" dispensed! Please collect!");
            atmMachine.setAvailableCash(atmMachine.getAvailableCash()-amount);
            System.out.println("Card ejected!");
            if(atmMachine.getAvailableCash()==0)
                atmMachine.setAtmState(new NoCash(atmMachine));
            else
                atmMachine.setAtmState(new Idle(atmMachine));
        }
    }
}
