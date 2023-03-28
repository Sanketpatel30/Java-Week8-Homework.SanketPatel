package Java_Week8_Homework_SanketPatel;

public class SharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(12,23);
        hasSharedDigit(9,99);
        hasSharedDigit(15,55);
        System.out.println(hasSharedDigit(12, 23));
    }
    public static boolean hasSharedDigit(int first, int second) {
        if (first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        }
        while (first > 0) {
            int lastDigit1 = first % 10;
            int lastDigit2 = second % 10;
            int firstDigit1 = first / 10;
            int firstDigit2 = second / 10;
            if ((lastDigit1 == lastDigit2) || (lastDigit1 == firstDigit2) || (firstDigit2 == lastDigit1) || (firstDigit1 == lastDigit2)) {
                return true;
            }
            first /= 10;
            second /= 10;
        }
        return false;
    }
}
