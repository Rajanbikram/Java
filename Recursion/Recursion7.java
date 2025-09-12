import java.util.Scanner;

public class Recursion7 {

    static void PrintMultiples(int n , int k){
        if(k==1){
            System.out.println(n);
            return;
        }
        PrintMultiples(n, k-1);

        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the Number");
        int n = sc.nextInt();
        int k = sc.nextInt();
        PrintMultiples(n,k);
    }
}
