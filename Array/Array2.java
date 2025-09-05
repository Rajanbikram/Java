package Java.Array;

public class Array2 {
   
    public static void main(String[] args) {
        int a = 10;   // first number
        int b = 20;   // second number

        System.out.println("Before Swapping: a = " + a + ", b = " + b);

        
        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: a = " + a + ", b = " + b);
    }
}


