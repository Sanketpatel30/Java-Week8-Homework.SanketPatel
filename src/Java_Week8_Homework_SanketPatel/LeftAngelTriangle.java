package Java_Week8_Homework_SanketPatel;

public class LeftAngelTriangle {
    public static void main(String[] args) {
        printLeftAngleTriangle(5);
    }
    public static void printLeftAngleTriangle(int a) {
        for (int i = 0; i < a + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

