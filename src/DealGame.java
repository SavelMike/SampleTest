/**
 * Created by Михаил on 16.01.2017.
 */
public class DealGame {
    public static void main(String[] args) {
        /*
         * 1) Distribute the suitcases, fill suitcases
         * 2) User selects a case; variable own_case_index is set
         * 3) the game
         *  3.1 ask user to open a case he does not own, index of suitcase opened
         *  3.2 open selected case: assigned 0 to element
         *  3.3 get bank offer, bankOffer method
         *  3.4 temps user with the offer for his suitcase
         *  3.5 if user accepted the offer  - the game is over. if not continue the for loop.
         * 4) Special situation: ask player to swamp. If user swamp, change his suitcase
          */
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
    public int bankOffer(int[] cases) {
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
     * @param Array
     */
    public static void FillSuitcases(int[] arrayOfSuitcases, int[] arrayOfMoney) {

    }
}
