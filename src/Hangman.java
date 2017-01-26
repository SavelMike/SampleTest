import java.util.Scanner;

/**
 * Created by Михаил on 25.01.2017.
 */
public class Hangman {

    public static void main(String[] args) {

        /*  define word for be figured out as a constant  */
        String word = "simple";

        while (gameIsOver() == false) {
            /* get char from user input */
            Scanner sc = new Scanner(System.in);
            System.out.println("Input your letter, please: ");
            String l = sc.next();
            if ( /* char is in word */) {
               /* mark all those chars in the word as open */
            } else {
                if (attempts == 0) {
                    player lost;
                    attempts--;
                }
            }
        }
    }

    /**
     * Display defined word
     *
     *
     */

    public static void displayWord() {

    }

    /**
     * Mark all chars which are opened in the word
     */
    public static void markChars(int[] opened, ) {

    }

    /**
     * Return true if all chars are opened
     * @param opened
     * @return
     */
    public static boolean gameIsOver(int[] opened) {

    }

}
