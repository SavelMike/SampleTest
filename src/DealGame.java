/**
 * Created by Михаил on 16.01.2017.
 */
public class DealGame {
    public static void main(String[] args) {

    }

    /*
    * for each element of arrays output in [] either p, or index or nothing
    * for example, [p] [2] [] [4]
    */
    public static void display_suitecases(int [] cases, int own_case_index) {
        for (int i = 0; i < cases.length; i++)
        {
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
}
