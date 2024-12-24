import java.util.*;

public class SmallestElement {

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 7, 4, 9, 3, 6, 8 };
        System.out.println("Smallest Element is:" + sort(arr));
        System.out.println("Smallest Element is:" + sort1(arr));
    }

    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    static int sort1(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}