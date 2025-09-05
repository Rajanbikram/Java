package Java.Array;

public class Array {
    public static void main(String[] args) {
          int[] arr = {1, 0, 1, 1, 0, 0, 1};  // Example array

        int countZero = 0;

        // Count number of 0s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }

        // Fill first 'countZero' elements with 0
        for (int i = 0; i < countZero; i++) {
            arr[i] = 0;
        }

        // Fill remaining with 1
        for (int i = countZero; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print sorted array
        System.out.println("Sorted Array of 0s and 1s:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
