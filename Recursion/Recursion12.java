
public class Recursion12 {
    static int sumArray(int[] arr, int idx) {
        if (idx == arr.length) {
            return 0;
        }

        int smallAns = sumArray(arr, idx + 1);

        return smallAns + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(sumArray(arr, 0));

    }
}

// sum of Array
