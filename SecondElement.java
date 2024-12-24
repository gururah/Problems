// import java.util.*;

public class SecondElement {

    public static void main(String[] args) {
        int arr[] = { 0, 5, 89, 32, 58, 90, 71, 20, 100 };
        int n = arr.length;
        System.out.println("Second smallest Element :" + smallest(arr, n));
        System.out.println("Second smallest Element :" + largest(arr, n));

    }

    static int smallest(int arr[], int n) {
        if (n == 0 || n == 1) {
            return -1;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                second_small = small;
                small = arr[i];
            } else if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
        }
        // int value = 0;
        return second_small;
    }

    static private int largest(int arr[], int n) {
        if (n == 0 || n == 1) {
            return -1;
        }
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < n; i++) {
            if (large < arr[i]) {
                second_large = large;
                large = arr[i];
            } else if (arr[i] < second_large && arr[i] != large) {
                second_large = arr[i];
            }

        }
        return second_large;
    }
}
