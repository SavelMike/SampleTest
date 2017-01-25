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
        while (isGameOver(numOfMatches) == false) {
            int i = 1;
            System.out.print("Player " + i + ", how many matches do you take (1, 2 or 3)? ");
            int playerChoice = scanner.nextInt();
            numOfMatches = numOfMatches - playerChoice;
            displayFlow(numOfMatches);
            i++;
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

