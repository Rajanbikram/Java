public class Factorial {

    static  int factorial(int n){
        if(n==0){
            return 1;
        }
         int ans = n * factorial(n-1);

         return ans;
    }

  public static void main(String[] args) {
    System.out.println(factorial(5));
  }
    }

