
public class Recursion10 {
  static void Array(int[] arr, int idx) {
    if (idx == arr.length) {
      return;
    }
    System.out.println(arr[idx]);

    Array(arr, idx + 1);
  }

  public static void main(String[] args) {
    int[] arr = { 5, 6, 7, 8, 9 };

    Array(arr, 0);
  }
}
