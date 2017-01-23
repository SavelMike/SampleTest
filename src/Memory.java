/**
 * Created by Михаил on 23.01.2017.
 */
public class Memory {
    public static void main(String[] args) {

        /* 1) Create an array of duplicate elements and array of 0. By using method fillArray */

        /* 2)Loop of the game. method isGameOver return false if all elements in opened array equals 1. Then loop is over */
        while (isGameOver(opened)) {
            /* Ask user for ind1 and ind2 */

            /* Check user's input */

            /* Call method checkMatches */
        }
    }

    /**
     * Display array, if elements of arrayOfDuplicates are the same, they are printed as (i), if elements are not guessed print without parentheses.
     * if elements are not chosen yet, print "."
     * @param arrayOfDuplicates
     * @param opened
     * @param ind1
     * @param ind2
     */
    public static void displayArray(int[] arrayOfDuplicates, int[] opened, int ind1, int ind2) {

    }

    /**
     * Fill array of duplicates with duplicates and second array with zeroes. Use for loop
     * @param duplicateElements
     * @param opened
     */
    public static void fillArray(int[] duplicateElements, int[] opened) {

    }


    /**
     *  if elements in duplicate array are equal, change corespondent elements in arrayOfNulls to 1.
     * @param arrayOfDuplicates
     * @param opened
     * @param ind1
     * @param ind2
     * */
    public static void checkMatches(int[] arrayOfDuplicates, int[] opened, int ind1, int ind2) {

    }

    /**
     * if elements in array opened all are equal 1, then return false.
     * @param opened
     */
    public static boolean isGameOver(int[] opened) {

    }
}
