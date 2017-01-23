import java.util.Random;
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
        int[] arrayOfMoney = {1, 20, 100, 1000, 2000, 5000};
        fillSuitcases(arrayOfSuitcases, arrayOfMoney);

        /* 2) Ask user for his suitcases, save in a variable userCaseIndex */
        int userCaseIndex;
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select the suitcase that you would like to own (1-6): ");
            userCaseIndex = scanner.nextInt();
            if ((userCaseIndex > 6) || (userCaseIndex < 1)) {
                continue;
            }
            userCaseIndex = userCaseIndex - 1;
            break;
        }

         /* 3) Game loop contains 3 rounds: */
        for (int i = 0; i < 4; i++) {

            while (true) {
                displaySuitcases(arrayOfSuitcases, userCaseIndex);
                /*  3.1) Ask user to open a suitcase, it must be a new suitcase. Repeat if input is wrong */
                Scanner sc = new Scanner(System.in);
                System.out.print("Please select the suitcase that you would like to open (1-6): ");
                int suitcaseToOpen = sc.nextInt();
                if ((suitcaseToOpen > 6) || (suitcaseToOpen < 1) || (suitcaseToOpen == userCaseIndex + 1)
                        || arrayOfSuitcases[userCaseIndex] == 0) {
                    continue;
                }
                arrayOfSuitcases[suitcaseToOpen - 1] = 0;
                break;
            }

            /*  3.2) Call offerBank method */
            int offer = bankOffer(arrayOfSuitcases);


            /*  3.3) Offer bank offer to user, if user accepted game is over  */
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Would you like to accept the bank’s offer? (y/n)");
                String answer = sc.next();
                if (answer.equals("y")) {
                    System.out.print("You accepted the offer of " + offer + " euro. Your own suitcase contained "
                            + arrayOfSuitcases[userCaseIndex] + " euro.");
                    if (offer > arrayOfSuitcases[userCaseIndex]) {
                        System.out.print(" Congratulations, you made the right choice!");
                    } else {
                        System.out.print(" Unfortunately, you could have done better.");
                    }
                    System.exit(0);
                }
                if (answer.equals("n")) {
                    break;
                } else {
                    continue;
                }
            }
        }

        /* 4) If there is last element in array, offer user to swap his case to last case */

        /* 4.1 Find last element in an array*/
        int indLastCase = 0;
        for (int i = 0; i < arrayOfSuitcases.length; i++) {
            if ((arrayOfSuitcases[i] != 0) && (i != userCaseIndex)) {
                indLastCase = i;
            }
        }

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("There is only 1 suitcase left. Would you like to swap? (y/n)");
            String choice = scanner.next();
            if (choice.equals("y")) {
                System.out.println("Your suitcase contains " + arrayOfSuitcases[indLastCase] +
                            " euro. The other unopened suitcase contained " + arrayOfSuitcases[userCaseIndex]);
                System.exit(0);
            }
            if (choice.equals(("n"))) {
                System.out.println("Your suitcase contains " + arrayOfSuitcases[userCaseIndex] +
                            " euro. The other unopened suitcase contained " + arrayOfSuitcases[indLastCase]);
                System.exit(0);
            } else {
                continue;
            }
            break;
        }
    }


    /**
     * Fill arrayOfSuitcases with money randomly
     * @param arrayOfSuitcases
     * @param arrayOfMoney
     */
    public static void fillSuitcases(int[] arrayOfSuitcases, int[] arrayOfMoney) {
        for (int i = 0; i < arrayOfSuitcases.length; i++) {
            arrayOfSuitcases[i] = pickMoneyRandomley(arrayOfMoney);
        }
    }

    /**
     * Display an array of cases with [p] if case is owned by user, [] if case is eliminated from the game, and [index] for rest of elements
     * @param arraySuitcases
     * @param userCaseIndex
     */
    public static void displaySuitcases(int[] arraySuitcases, int userCaseIndex) {
        for (int i = 0; i < arraySuitcases.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            if (userCaseIndex == i) {
                System.out.print("[p]");
                continue;
            }
            if (arraySuitcases[i] == 0) {
                System.out.print("[]");
                continue;
            }

            System.out.print("[" + (i + 1) + "]");
        }
        System.out.println();
    }


    /**
     * Create an offer by dividing sum of all unopened suitcases on amount of unopened cases plus 1
     * @param arrayOfSuitcases
     */
    public static int bankOffer(int[] arrayOfSuitcases) {
        int sum = 0;
        int unopenedCases = 0;
        for (int i = 0; i < arrayOfSuitcases.length; i++) {
            sum += arrayOfSuitcases[i];
            if (arrayOfSuitcases[i] != 0) {
                unopenedCases++;
            }

        }
        return sum / (unopenedCases + 1);
    }

    /**
     *
     * @param arrayOfMoney
     * @return
     */
    public static int pickMoneyRandomley(int[] arrayOfMoney) {
        int value;
        while (true) {
            int index = getRandom(5);
            if (arrayOfMoney[index] == 0) {
                continue;
            }
            value = arrayOfMoney[index];
            arrayOfMoney[index] = 0;
            return value;
        }
    }

    /**
     *
     * @param max
     * @return
     */
    public static int getRandom(int max) {
        Random rand = new Random();
        return rand.nextInt(max + 1);
    }
}




