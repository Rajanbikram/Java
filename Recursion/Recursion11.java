
public class Recursion11 {
  static int maxArray(int[] arr, int idx) {
    if (idx == arr.length-1) {
      return arr[idx];
    }
    int smallAns = maxArray(arr, idx+1);

    return Math.max(arr[idx], smallAns);
  }

  public static void main(String[] args) {
    int[] arr = { 5, 6, 17, 8, 9 };
    System.out.println(maxArray(arr, 0));

  }
}

// max value in Array