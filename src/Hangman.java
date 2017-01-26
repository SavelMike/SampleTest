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
            if (markOpenedChars()) {
                    /* good attempt */
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
     * Display word hiding chars not guessed yet
     * @param word
     * @param opened
     *
     */

    public static void displayWord(int[] opened, String word) {

    }

    /**
     * if word consist I, put 1 in all corespondent elements in opened[]
     * @param opened
     * @param word
     * @param l
     * return true if char I presents in word
     */
    public static boolean markOpenedChars(int[] opened, String word, char l) {

    }

    /**
     * Return true if all chars are opened
     * @param opened
     * @return
     */
    public static boolean gameIsOver(int[] opened) {

    }
}
