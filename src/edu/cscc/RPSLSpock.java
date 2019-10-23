package edu.cscc;
import java.util.Random;
/**
 * @author Owen Okuley
 */
public class RPSLSpock {
    static Random rand = new Random(System.currentTimeMillis());

    public static final String ROCK = "rock";
    public static final String PAPER = "paper";
    public static final String SCISSORS = "scissors";
    public static final String LIZARD = "lizard";
    public static final String SPOCK = "spock";
    /**
     * all these strings set the different valid choices
     */
    public static boolean isValidPick(String pick) {
        /**
         * @param isValidPick get valid picks
         * if the pick is equal to null or in other words is not one of the choices then it will be
         * @return – returned false and it will say that is not a valid choice and you will be prompted to pick again
         */
        if (pick == null) {
            return false;
        }
        /**
        * if the pick is equal to pick or one of the choices then
        * @return – it will return your pick regardless of its case
        */
        pick = pick.trim();
        return (ROCK.equalsIgnoreCase(pick) ||
                PAPER.equalsIgnoreCase(pick) ||
                SCISSORS.equalsIgnoreCase(pick) ||
                LIZARD.equalsIgnoreCase(pick) ||
                SPOCK.equalsIgnoreCase(pick));
    }

    public static String generatePick() {
        /**
         * @param generatePick stores the random picks
         * if the pick is null then computer randomly picks between the five picks then
         * @return – it will return the computers pick
         */
        String pick = null;
        switch (rand.nextInt(5)) {
            case 0:
                pick = ROCK;
                break;
            case 1:
                pick = PAPER;
                break;
            case 2:
                pick = SCISSORS;
                break;
            case 3:
                pick = LIZARD;
                break;
            case 4:
                pick = SPOCK;
                break;
        }
        /**
         * @return – it will return the computers pick
         */
        return pick;
    }

    public static boolean isComputerWin(String c_pick,String h_pick) {
        /**
         * @param isComputerWin tells if the computer will win or not
         * if the pick the h pick then it will lose to the c pick
         * @return – it will return if the computer pick will win or lose to your pick depending on whatever you pick
         */
        h_pick = h_pick.toLowerCase();
        return ((ROCK.equals(c_pick) && (SCISSORS.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (PAPER.equals(c_pick) && (ROCK.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SCISSORS.equals(c_pick) && (PAPER.equals(h_pick) || LIZARD.equals(h_pick))) ||
                (LIZARD.equals(c_pick) && (PAPER.equals(h_pick) || SPOCK.equals(h_pick))) ||
                (SPOCK.equals(c_pick) && (ROCK.equals(h_pick) || SCISSORS.equals(h_pick))));
    }
}