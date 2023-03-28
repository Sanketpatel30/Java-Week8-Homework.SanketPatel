package Java_Week8_Homework_SanketPatel;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        //calling method
        tenNumberSum();
    }
    //Creating method
    public static void tenNumberSum() {
        Scanner scanner = new Scanner(System.in);
        int count = 1;
        int sum = 0;

        //using while loop to sum up the values entered in console by user
        while (count <= 10) {
            //Guidance for user to enter next number
            System.out.print("Enter Number #" + count + " :");
            //using method "hasNextInt()"
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum = sum + number; //method to sum up all the values entered in console
                count++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum=" + sum);
        scanner.close();
    }


}
