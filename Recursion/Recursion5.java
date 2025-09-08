public class Recursion5 {

    static  int f(int n){
        if(n>=0 && n<=9){
            return n ;
        }
        int ans = f(n/10) + f(n%10);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(f(12345));
    }
}
