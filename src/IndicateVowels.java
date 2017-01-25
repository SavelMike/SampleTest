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
     * Calculate vowels from user's input, return true if there are vowels
     * @param symbol
     * @return true if vowel
     */
    public static boolean isVowel(char symbol) {
        if (('a' == symbol) || ('e' == symbol) || ('i' == symbol) || ('o' == symbol) || ('u' == symbol) || ('y' == symbol) ||
                ('A' == symbol) || ('E' == symbol) || ('I' == symbol) || ('O' == symbol) || ('U' == symbol) || ('Y' == symbol)) {
            return true;
        } else {
            return false;
        }
    }
}
