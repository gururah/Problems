import java.util.*;

public class LargestElement {

    public static void main(String[] args) {
        int arr[] = { 4, 8, 90, 32, 67, 41, 28 };
        System.out.println("LargestElement is:" + sort(arr));
        System.out.println("LargestElement is:" + sort1(arr));
    }

    static int sort(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }

    static int sort1(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
