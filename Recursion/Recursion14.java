
public class Recursion14 {
    static void printOdd(int n) {
        if (n == 0) {
            return;
        }

        printOdd(n - 1);

        if (n % 2 != 0) {
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        int n = 10;
        printOdd(n);
    }
}