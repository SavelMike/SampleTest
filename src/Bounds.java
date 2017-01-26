import java.util.Scanner;

/**
 * Created by Михаил on 26.01.2017.
 */
public class Bounds {
    public static void main(String[] args) {
        getDoubleBetweenBounds(35, 60);
    }

    public static void getDoubleBetweenBounds(int lowerBound, int upperBound) {
        System.out.println("(lower bond = " + lowerBound + ", upper bond = " + upperBound + ")");
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number: ");
        while (true) {
            double inputDouble = sc.nextDouble();
            if ((inputDouble > upperBound) || (inputDouble < lowerBound)) {
                System.out.print("Incorrect! Input another number: ");
                continue;
            } else {
                System.out.println(inputDouble);
                break;
            }
        }
    }
}
