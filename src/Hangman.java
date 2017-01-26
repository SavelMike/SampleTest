import java.util.Scanner;

/**
 * Created by Михаил on 25.01.2017.
 */
public class Hangman {

    public static void main(String[] args) {

        /*  define word for be figured out as a constant, create an array of 0, initialize variable attempts  */
        String word = "simplification";
        int[] opened = new int[14];
        int attempts = 6;
        for (int i = 0; i < opened.length; i++) {
            opened[i] = 0;
        }

        while (!gameIsOver(opened)) {
            /* get char from user input */
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your letter, please: ");
            String l = sc.next();
            if (markOpenedChars(opened, word, l)) {
                /* good attempt */
                continue;
            } else {
                /* If attempts equal 0, player lost. if not attempts minus 1 */
                if (attempts == 0) {
                    System.out.println("No more attempts, you lost.");
                    System.exit(0);
                }
                attempts--;
            }
        }
        System.out.println("Congratulations, You won!");
    }

    /**
     * Display word hiding chars not guessed yet
     * @param word
     * @param opened
     *
     */

    public static void displayWord(int[] opened, String word) {

    }

    /**
     * if word consist l, put 1 in all corespondent elements in opened[]
     * @param opened
     * @param word
     * @param l
     * return true if ch l presents in word
     */
    public static boolean markOpenedChars(int[] opened, String word, String l) {
        for (int i = 0; i < opened.length; i++) {
            if (word.charAt(i) == l.charAt(i)) {
                opened[i] = 1;
            }
        }
    }

    /**
     * Return true if all chars are opened
     * @param opened
     * @return
     */
    public static boolean gameIsOver(int[] opened) {

    }
}
