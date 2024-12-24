import java.util.*;

public class IncreasingDecreasing {
    public static void main(String[] args) {
        int arr[] = { 4, 2, 8, 6, 15, 5, 9, 20 };
        int len = arr.length;
        order(arr, len);
    }

    static void order(int arr[], int len) {
        Arrays.sort(arr);
        int mid = len / 2;
        while (mid < len) {
            int temp = arr[mid];
            arr[mid] = arr[len - 1];
            arr[len - 1] = temp;
            mid++;
            len--;
        }
        printArray(arr);

    }

    static void printArray(int arr[]) {
        int num = arr.length;
        for (int i = 0; i < num; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
