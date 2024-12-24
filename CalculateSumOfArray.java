import java.util.stream.IntStream;

public class CalculateSumOfArray {
    public static void main(String[] args) {
        int arr[] = { 10, 90, 5, 20, 75 };
        int n = arr.length;
        System.out.println(sumOfArray(arr, n));
        sumOfArr(arr);
    }

    static int sumOfArray(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = arr[i] + sum;
        }
        return sum;
    }

    static void sumOfArr(int arr[]) {
        int last = IntStream.of(arr).sum();
        System.out.println(last);
    }
}
