package Java.Recursion;

import java.util.Scanner;

public class RecursionDecreasing {

    static void printDecreasing(int n){

        if(n==1){
            System.out.println(1);
            return;
        }

        System.out.println(n);

        printDecreasing(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
