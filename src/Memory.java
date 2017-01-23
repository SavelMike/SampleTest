import java.util.Scanner;

/**
 * Created by Михаил on 23.01.2017.
 */
public class Memory {
    public static void main(String[] args) {

        /* 1) Create an array of duplicate elements and array of 0. By using method fillArray */
        int[] arrGameCard = new int[8];
        int[] arrFoundPairs = new int[8];
        fillArray(arrGameCard, arrFoundPairs);

        /* 2)Loop of the game. method isGameOver return false if all elements in opened array equals 1. Then loop is over */
        while (isGameOver(arrGameCard)) {
            /* Ask user for ind1 and ind2 */
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter index 1:");
            int ind1 = sc.nextInt();
            System.out.println("Please enter index 2:");
            int ind2 = sc.nextInt();
            /* Check user's input */
            if ((ind1 < 0) || (ind1 > 7) || (ind2 < 0) || (ind2 > 7) || (ind1 == ind2)) {
                continue;
            }
            checkMatches(arrGameCard, arrFoundPairs, ind1, ind2);

            /* Call method checkMatches */

            displayArray(arrGameCard, arrFoundPairs, ind1, ind2);
        }
    }

    /**
     * Display array, if elements of gameCard are the same, they are printed as (i), if elements are not guessed print without parentheses.
     * if elements are not chosen yet, print "."
     * @param arrGameCard
     * @param arrFoundPairs
     * @param ind1
     * @param ind2
     */
    public static void displayArray(int[] arrGameCard, int[] arrFoundPairs, int ind1, int ind2) {
        System.out.println("[");
        for (int i = 0; i < arrGameCard.length; i++) {
            if (i == ind1) || (i == ind2) || () {
                System.out.print(" .");
            }
        }
    }

    /**
     * Fill array of duplicates with duplicates and second array with zeroes. Use for loop
     * @param arrGameCard
     * @param arrFoundPairs
     */
    public static void fillArray(int[] arrGameCard, int[] arrFoundPairs) {
        for (int i = 0; i < arrGameCard.length; i++) {
            arrGameCard[i] = i/2 + 1;
            arrFoundPairs[i] = 0;
        }
    }


    /**
     *  if elements in duplicate array are equal, change corespondent elements in arrayOfNulls to 1.
     * @param arrGameCard
     * @param arrFoundPairs
     * @param ind1
     * @param ind2
     * */
    public static void checkMatches(int[] arrGameCard, int[] arrFoundPairs, int ind1, int ind2) {

    }

    /**
     * if elements in array opened all are equal 1, then return false.
     * @param arrFoundPairs
     */

    public static boolean isGameOver(int[] arrFoundPairs) {

    }
}
