import java.util.Scanner;

/**
 * Created by Михаил on 25.01.2017.
 */
public class IndicateVowels {

    /**
     * Take input from user by Scanner save in nextLine, call method isVowel, count the number of vowels
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your sentence: ");
        String str = sc.nextLine();
        int cnt = 0;
        for (int i = 0; i < str.length(); i ++) {
            if (isVowel(str.charAt(i))) {
                cnt++;
            }
        }
        System.out.println("This sentence contains " + cnt + " vowels.");
    }

    /**
     * Indicate vowels from user's input, return true if there are vowels
     * @param userInput
     * @return true if vowel
     */
    public static boolean isVowel(char userInput) {
        if (('a' == userInput) || ('e' == userInput) || ('i' == userInput) || ('o' == userInput) || ('u' == userInput) || ('y' == userInput)
                || ('A' == userInput) || ('E' == userInput) || ('I' == userInput) || ('O' == userInput) || ('U' == userInput) || ('Y' == userInput)) {
            return true;
        } else {
            return false;
        }
    }
}
