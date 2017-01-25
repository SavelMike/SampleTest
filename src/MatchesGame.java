import java.util.Scanner;

/**
 * Created by Михаил on 25.01.2017.
 */
public class MatchesGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMatches = 21;
        while (true) {

            /* check whether there only 1 match left, if it is - player 1 lost */
            if (numOfMatches == 1) {
                System.out.println("Player 1 lost");
                break;
            }

            /* get player 1 input */
            int playerChoice = 0;
            playerChoice = playerMove(numOfMatches, "Player 1");

            numOfMatches = numOfMatches - playerChoice;
            displayFlow(numOfMatches);

            /* check whether there only 1 match left, if it is - player 2 lost */
            if (numOfMatches == 1) {
                System.out.println("Player 2 lost");
                break;
            }

            /* get player 2 input */
            playerChoice = playerMove(numOfMatches, "Player 2");
            numOfMatches = numOfMatches - playerChoice;
            displayFlow(numOfMatches);
        }
    }

    public static void displayFlow(int numOfMatches) {
        for (int i = 0; i < numOfMatches; i++) {
            System.out.print(" |");
        }
        System.out.println(" (" + numOfMatches + ")");
    }

    /**
     * Ask player for playerChoice, check the input, return integer
     * @param numOfMatches
     * @return number of matches player takes (1,2 or 3)
     */
    public static int playerMove(int numOfMatches, String name) {
        Scanner sc = new Scanner(System.in);
        int playerChoice;
        while (true) {
            System.out.print( name + ", how many matches so you take (1, 2 or 3)? ");
            playerChoice = sc.nextInt();

            if ((numOfMatches == 3) && (playerChoice == 3)) {
                continue;
            }
            if ((numOfMatches == 2) && (playerChoice > 1)) {
                continue;
            }
            if ((playerChoice > 3) || (playerChoice < 1)) {
                continue;
            }
            break;
        }
        return playerChoice;
    }
}

