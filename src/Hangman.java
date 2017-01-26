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
            if (/* call method markOpenedChars(), return true if user guessed and false if opposite */) {
               continue;
            } else {
                /* If attempts equal 0, player lost. if not attempts minus 1; */
                if (attempts == 0) {
                    player lost;
                }
                attempts--;
            }
        }
    }

    /**
     * Display defined word with opened letters if user has already guessed them
     * @param word
     * @param opened
     *
     */

    public static void displayWord(int[] opened, String word) {

    }

    /**
     * Mark all chars which are opened in the word
     * @param opened
     * @param word
     */
    public static boolean markOpenedChars(int[] opened, String word) {

    }

    /**
     * Return true if all chars are opened
     * @param opened
     * @return
     */
    public static boolean gameIsOver(int[] opened) {

    }
}
