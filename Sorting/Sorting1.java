package Sorting;

public class Sorting1 {
    
    static void selectionsort(int a[]) {
        int n = a.length;

        for (int i = 0; i < n - 1; i++) {

            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min_index]) {
                    min_index = j;
                }
            }

            int temp = a[i];
            a[i] = a[min_index];
            a[min_index] = temp;
        }

    }

    public static void main(String[] args) {
        int a[] = { 7, 3, 4, 5, 2, 1 };
        selectionsort(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

