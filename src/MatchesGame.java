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
            int playerChoice;
            while (true) {
                System.out.print("Player 1, how many matches do you take (1, 2 or 3)? ");
                playerChoice = scanner.nextInt();

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

            numOfMatches = numOfMatches - playerChoice;
            displayFlow(numOfMatches);

            /* check whether there only 1 match left, if it is - player 2 lost */
            if (numOfMatches == 1) {
                System.out.println("Player 2 lost");
                break;
            }

            /* get player 2 input */
            while (true) {
                System.out.print("Player 2, how many matches so you take (1, 2 or 3)? ");
                playerChoice = scanner.nextInt();

                if (numOfMatches == 3) {
                    if (playerChoice == 3) {
                        continue;
                    }
                }
                if (numOfMatches == 2) {
                    if (playerChoice > 1) {
                        continue;
                    }
                }
                if (playerChoice > 3) {
                    continue;
                }
            }
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
}

