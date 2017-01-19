import java.util.Scanner;

/**
 * Created by Михаил on 16.01.2017.
 */
public class DealGame {
    public static void main(String[] args) {

        /* * 1) Distribute the suitcases, FillSuitcases method */
        int[] arrayOfSuitcases = new int[6];
        int[] arrayOfMoney = {1, 20, 100, 1000, 2000, 5000};
        fillSuitcases(arrayOfSuitcases, arrayOfMoney);

        /* 2) User selects a case; variable ownCaseIndex is set*/
        int ownCaseIndex;
        while (true) {
            System.out.print("Please select the suitcase that you would like to own (1-6): ");
            Scanner sc = new Scanner(System.in);
            ownCaseIndex = sc.nextInt();
            if ((ownCaseIndex < 0) || (ownCaseIndex > 6)) {
                continue;
            }
            ownCaseIndex = ownCaseIndex - 1;
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
                if ((suitcaseToOpen < 1) || (suitcaseToOpen > 6) || (suitcaseToOpen == ownCaseIndex + 1) ||
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
                System.out.print("Would you like to accept the bank’s offer? (y/n)");
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
                if (choice.equals("n")) {
                    break;
                } else {
                    continue;
                }
            }
        }

        /*
        * 4 Find content of last unopened case
        */
        int lastCaseContent = 0;
        for (int i = 0; i < arrayOfSuitcases.length; i++) {
            if ((arrayOfSuitcases[i] != 0) && (i != ownCaseIndex)) {
                lastCaseContent = i;
            }
        }

        /*
        *  4) Special situation: ask player to swap. If user swap, change his suitcase
         */
        while (true) {
            System.out.println("There is only 1 suitcase left. Would you like to swap? (y/n)");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            if (choice.equals("y")) {
                System.out.println("Your suitcase contains " + arrayOfSuitcases[lastCaseContent] +
                        "  euro. The other unopened suitcase contained " + arrayOfSuitcases[ownCaseIndex] + " euro.");
            }
            if (choice.equals("n")) {
                System.out.println("Your suitcase contains " + arrayOfSuitcases[ownCaseIndex] +
                        " euro. The other unopened suitcase contained " + arrayOfSuitcases[lastCaseContent]);
            } else {
                continue;
            }
            break;
        }

    }

    /*
    * for each element of arrays output in [] either p, or index or nothing
    * for example, [p] [2] [] [4]
    */
    public static void displaySuitecases(int[] cases, int own_case_index) {
        for (int i = 0; i < cases.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            if (i == own_case_index) {
                System.out.print("[p]");
                continue;
            }
            if (cases[i] == 0) {
                System.out.print("[]");
                continue;
            }

            System.out.print("[" + (i + 1) + "]");
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
     * @param cases -
     * @return
     */
    public static int bankOffer(int[] cases) {
        int sum = 0;
        int amountOfEl = 0;
        for (int i = 0; i < cases.length; i++) {
            sum += cases[i];
            if (cases[i] != 0) {
                amountOfEl++;
            }

        }
        return sum / (amountOfEl + 1);
    }

    /**
     * Fill suitcases,
     *
     * @param
     */
    public static void fillSuitcases(int[] arrayOfSuitcases, int[] arrayOfMoney) {
        arrayOfSuitcases[0] = arrayOfMoney[2];
        arrayOfSuitcases[1] = arrayOfMoney[5];
        arrayOfSuitcases[2] = arrayOfMoney[3];
        arrayOfSuitcases[3] = arrayOfMoney[0];
        arrayOfSuitcases[4] = arrayOfMoney[1];
        arrayOfSuitcases[5] = arrayOfMoney[4];
    }
}
