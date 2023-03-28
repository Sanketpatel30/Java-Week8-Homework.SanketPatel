package Java_Week8_Homework_SanketPatel;

public class RightAngelTriangle {

    public static void main(String[] args) {
        int i, j, n = 5;
        //for loop method
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
