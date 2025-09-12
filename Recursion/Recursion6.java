
public class Recursion6 {
    static int pow(int p, int q) {
        if (q == 0) {
            return 1;
        }
        int smallans = pow(p, q - 1) * p;
        return smallans;

    }

    public static void main(String[] args) {
        System.out.println(pow(5, 4));
    }
}
