package Java_Week8_Homework_SanketPatel;

public class FibonacciNumber {
    static void Fibonacci(int N) {
        int n1 = 1, n2 = 1;
        int c = 1;
        while (c < N) {
            System.out.print(n1 + " ");
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            c = c + 1;
        }

    }
    public static void main(String[] args) {
        int N = 10;
        Fibonacci(N);
    }
}
