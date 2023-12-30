package behavioral_patterns.state_pattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(10000);
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.printf(" 1. Insert Card %n 2. Enter Pin %n 3. Request Cash %n 4. Eject Card %n 5. Exit %n Choose Option: ");
            int option = scanner.nextInt();
            if(option==5)   break;
            System.out.println();
            switch (option){
                case 1 -> {
                    atmMachine.insertCard();
                    break;
                }
                case 2 -> {
                    atmMachine.authenticatePin();
                    break;
                }
                case 3 -> {
                    atmMachine.requestCash();
                    break;
                }
                case 4 -> {
                    atmMachine.ejectCard();
                    break;
                }
                default -> System.out.println("Please select a valid option!");
            }
            System.out.println();
        }
    }
}
