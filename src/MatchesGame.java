import java.util.Scanner;

/**
 * Created by Михаил on 25.01.2017.
 */
public class MatchesGame {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMatches = 21;
        while (!isGameOver(numOfMatches)) {
            System.out.print("Player 1, how many matches do you take (1, 2 or 3)? ");

            /* get user1 input */
            /* check whether there only 1 match left, if it is - user 1 lost */
            if (numOfMatches == 1) {
                System.out.println("Player 1 lost");
                System.exit(1);
            }
            int player1Choice = scanner.nextInt();
            numOfMatches = numOfMatches - player1Choice;
            displayFlow(numOfMatches);

            System.out.print("Player 2, how many matches so you take (1, 2 or 3)? ");

            /* get user2 input */
            /* check whether there only 1 match left, if it is - user 2 lost */
            if (numOfMatches == 1) {
                System.out.println("Player 2 lost");
                System.exit(0);
            }
            int player2Choice = scanner.nextInt();
            numOfMatches = numOfMatches - player2Choice;
            displayFlow(numOfMatches);
        }
    }

    /**
     *
     */
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

