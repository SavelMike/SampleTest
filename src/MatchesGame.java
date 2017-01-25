import java.util.Scanner;

/**
 * Created by Михаил on 25.01.2017.
 */
public class MatchesGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMatches = 21;
        while (true) {

            /* check whether there only 1 match left, if it is - user 1 lost */
            if (numOfMatches == 1) {
                System.out.println("Player 1 lost");
                break;
            }

            int playerChoice;
            while (true) {
                /* get player 1 input */
                System.out.print("Player 1, how many matches do you take (1, 2 or 3)? ");
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


            /* get player 2 input */
            while (true) {
                System.out.print("Player 2, how many matches so you take (1, 2 or 3)? ");
                playerChoice = scanner.nextInt();
                if (numOfMatches == 1) {
                    System.out.println("Player 2 lost");
                    break;
                }

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

                numOfMatches = numOfMatches - playerChoice;
                displayFlow(numOfMatches);
            }
        }
    }


    public static void displayFlow(int numOfMatches) {
        for (int i = 0; i < numOfMatches; i++) {
            System.out.print(" |");
        }
        System.out.println(" (" + numOfMatches + ")");
    }

    public static boolean isGameOver(int numOfMatches) {
        if (numOfMatches == 1) {
            return true;
        }
        return false;
    }
}

