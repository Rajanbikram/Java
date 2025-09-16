public class Recursion13 {
    static void printEven(int n) {
        if (n == 0) {
            return;
        }

        printEven(n - 1);

        if (n % 2 == 0) {
            System.out.println(n);
        }

    }

    public static void main(String[] args) {
        int n = 10;
        printEven(n);
    }
}