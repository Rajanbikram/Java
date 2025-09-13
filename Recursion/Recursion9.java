import java.util.Scanner;

public class Recursion9 {

  static int iGCD(int x, int y){
    while(x%y !=0){
      int rem = x%y;
      x = y;
      y = rem;
    }
    return y;

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a num");
    int x = sc.nextInt();
    int y = sc.nextInt();
    System.out.println(iGCD(x, y));
  }
}
