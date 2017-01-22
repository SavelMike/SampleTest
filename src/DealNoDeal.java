import java.util.Scanner;

/**
 * Created by Михаил on 22.01.2017.
 */
public class DealNoDeal {

    /**
     * The game
     * @param args
     */
    public static void main(String[] args) {

        /* 1) Create and fill suitcases */
        int[] arrayOfSuitcases = new int[6];
        int[] arrayOfMoney = {1, 20, 1000, 2000, 5000};
        fillSuitcases(arrayOfSuitcases, arrayOfMoney);

        /* 2) Ask user for his suitcases, save in a variable userCaseIndex */
        int userCaseIndex;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select the suitcase that you would like to own (1-6): ");
            userCaseIndex = scanner.nextInt();
            if ((userCaseIndex > 6) || (userCaseIndex < 0)) {
                continue;
            }
            userCaseIndex = userCaseIndex - 1;
            break;
        }

         /* 3) Game loop contains 4 steps:

         /*  3.1) Ask user to open a suitcase, it must be a new suitcase. Repeat if input is wrong */

         /*  3.2) Call offerBank method

         /*  3.3) Offer bank offer to user, if user accepted game is over  */

         /*  3.4) If there is last element in array, offer user to swap his case to last case */
    }


    /**
     * Fill arrayOfSuitcases with money randomly
     * @param arrayOfSuitcaes
     * @param arrayOfMoney
     */
    public static void fillSuitcases(int[] arrayOfSuitcaes, int[] arrayOfMoney) {

    }

    /**
     * Display an array of cases with [p] if case is owned by user, [] if case is eliminated from the game, and [index] for rest of elements
     * @param araySuitcases
     * @param userCaseIndex
     */
    public static void displaySuitcases(int[] araySuitcases, int userCaseIndex) {

    }


    /**
     * Create an offer by dividing sum of all unopened suitcases on amount of unopened cases plus 1
     * @param arrayOfSuitcases
     */
    public static void bankOffer(int[] arrayOfSuitcases) {

    }
}



