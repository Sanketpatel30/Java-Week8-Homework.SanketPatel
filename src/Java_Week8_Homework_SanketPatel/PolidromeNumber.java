package Java_Week8_Homework_SanketPatel;
import java.util.Scanner;
public class PolidromeNumber {
    public static boolean isPalindrome(int number) {
        //converts negative number to positive number
        if (number < 0) {
            number = -number;
        }
        int lastDigit, reverse = 0, temp;
        temp = number;
        while (number > 0) {
            //Stores the last digit
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number = number / 10;
        }
        return reverse == temp;
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = sc.nextInt();
        boolean check = isPalindrome(a);
        //checks number is Palindrome or not
        if (check)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
        // closing the scanner object
        sc.close();
    }
}
