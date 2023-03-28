package Java_Week8_Homework_SanketPatel;
import java.util.Scanner;
public class MinandMaxInPutChallenge {

    public static void main(String[] args) {
        MinandMaxInPutChallenge mmi = new MinandMaxInPutChallenge();
        mmi.minMax();
    }

    public void minMax() {
        Scanner sc = new Scanner(System.in);
        int min = 0, max = 0;
        boolean first = true;
        while (true) {

            System.out.println("Enter number:");
            boolean b = sc.hasNextInt();
            if (b) {
                int number = sc.nextInt();
                if (first) {
                    first = false;
                    min = number;
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }

            } else {
                break;
            }
            sc.close();

        }
    }
}

