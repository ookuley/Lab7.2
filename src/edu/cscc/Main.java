package edu.cscc;
import java.util.*;
/**
 * @author Owen Okuley
 */
public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String h_pick;
        String c_pick;
        String answer;
        boolean isValid;
        /**
         * @param isValid shows the if its a valid choice or not
         * @param answer answer yes or no
         * @param c_pick computer pick
         * @param h_pick human pick
         */

        /**
         *asks for users to pick one of the valid choices
         */
        do {
            System.out.println("Let's play rock, paper, scissors, lizard, spock");
            do {
                System.out.print("Enter your choice: ");
                h_pick = input.nextLine();
                isValid = RPSLSpock.isValidPick(h_pick);
                if (!isValid) {
                    System.out.println(h_pick + " is not a valid choice");
                }
            } while (!isValid);
            /**
             * outputs what the computer picked and who wins
             */
            c_pick = RPSLSpock.generatePick();
            System.out.print("Computer picked " + c_pick + "  ");

            if (c_pick.equalsIgnoreCase(h_pick)) {
                System.out.println("Tie!");
            } else if (RPSLSpock.isComputerWin(c_pick, h_pick)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("You win!");
            }
            /**
             * asks the users if they want to play again with a yes or no question
             */
            System.out.print("Play again ('y' or 'n'): ");
            answer = input.nextLine();
        } while ("Y".equalsIgnoreCase(answer));
        System.out.println("Live long and prosper!");
    }
}