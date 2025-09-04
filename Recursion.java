package Java;
import java.util.Scanner;

public class Recursion {

    static void printIncresing(int n){

        if(n==1){
            System.out.println(n);
            return;
        }

        printIncresing(n-1);

        System.out.println(n);
    }

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number");
    int n = sc.nextInt();

    System.out.println("number from 1 to " + n +":");
    printIncresing(n);

 }
    
}
