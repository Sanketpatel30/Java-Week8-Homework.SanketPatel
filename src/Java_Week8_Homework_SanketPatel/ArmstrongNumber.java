package Java_Week8_Homework_SanketPatel;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        int number =370, originalaNumber,remainder,result=0;
        System.out.println("Enter the number ");
        Scanner s = new Scanner(System.in);
        s.nextLine();
        originalaNumber = number;
        s.close();

        while (originalaNumber !=0) {
            remainder = originalaNumber % 10;
            result += Math.pow(remainder, 3);
            originalaNumber /= 10;
        }
        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + "is not an armstrong number");
    }
}
