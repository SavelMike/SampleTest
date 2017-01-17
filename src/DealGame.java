import java.util.Scanner;

/**
 * Created by Михаил on 16.01.2017.
 */
public class DealGame {
    public static void main(String[] args) {

        /* * 1) Distribute the suitcases, FillSuitcases method */
        int[] arrayOfSuitcases = {6};
        int[] arrayOfMoney = {6};
        fillSuitcases(arrayOfSuitcases, arrayOfMoney);

        /* 2) User selects a case; variable ownCaseIndex is set*/
        int ownCaseIndex;
        while (true) {
            System.out.print("Please select the suitcase that you would like to own (1-6): ");
            Scanner sc = new Scanner(System.in);
            ownCaseIndex = sc.nextInt();
            if ((ownCaseIndex < 1) || (ownCaseIndex > 6)) {
                continue;
            }
            break;
        }


        /*
         * 3) the game
         */
        for (int i = 0; i < 4; i++) {
            /* 3.1 ask user to open a case he does not own, eliminate chosen case from the game, display the suitcases */
            while (true) {
                displaySuitecases(arrayOfSuitcases, ownCaseIndex);
                System.out.print("Please select the suitcase that you would like to open: ");
                Scanner scanner = new Scanner(System.in);
                int suitcaseToOpen = scanner.nextInt();
                if ((suitcaseToOpen < 1) || (suitcaseToOpen > 6) || (suitcaseToOpen == ownCaseIndex) ||
                        (arrayOfSuitcases[suitcaseToOpen - 1] == 0)) {
                    continue;
                }
                arrayOfSuitcases[suitcaseToOpen - 1] = 0; // Eliminate the case from the game;
                break;
            }

            /*
            *  3.2 get bank offer, bankOffer method
            */
            int offer = bankOffer(arrayOfSuitcases);

            /*
            *  3.3 temps user with the offer for his suitcase
            */
            while (true) {
                System.out.println("Would you like to accept the bank’s offer? (y/n)");
                Scanner sc = new Scanner(System.in);
                String choice = sc.next();
                if (choice.equals("y")) {
                    System.out.print("You accepted the offer of " + offer + " euro. Your suitcase contained: " +
                            arrayOfSuitcases[ownCaseIndex] + " euro.");
                    if (offer > arrayOfSuitcases[ownCaseIndex]) {
                        System.out.print(" Congratulations, you made the right choice!");
                    } else {
                        System.out.print("  Unfortunately, you could have done better.");
                    }
                    System.exit(0);
                }
            }

            /*  3.4 if user accepted the offer  - the game is over. if not continue the for loop.
            * 4) Special situation: ask player to swamp. If user swamp, change his suitcase
            */
        }
    }

    /*
    * for each element of arrays output in [] either p, or index or nothing
    * for example, [p] [2] [] [4]
    */
    public static void displaySuitecases(int [] cases, int own_case_index) {
        for (int i = 0; i < cases.length; i++) {
            if (i != 0) {
                System.out.println(" ");
            }
            if (i + 1 == own_case_index) {
                System.out.println("[p]");
                continue;
            }
            if (cases[i] == 0) {
                System.out.println("[]");
                continue;
            }

            System.out.print("["+ i + 1 + "]");
        }
        System.out.println();
    }

    /*
    *  bankOffer
    * arguments:  int [] cases
    * return value: offer
    * sum all elements and divide by number of non-zero elements + 1
    */

    /**
     *
     * @param cases -
     * @return
     */
    public static int bankOffer(int[] cases) {
        int sum = 0;
        int amountOfEl = 0;
        for (int i = 0; i < cases.length; i++) {
            sum += cases[i];
            if (cases[i] != 0) {
                amountOfEl ++;
            }

        }
        return  sum / (amountOfEl + 1);
    }

    /**
     * Fill suitcases
     *
     * @param
     */
    public static void fillSuitcases(int[] arrayOfSuitcases, int[] arrayOfMoney) {

    }
}
