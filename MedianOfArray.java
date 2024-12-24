import java.util.Arrays;

public class MedianOfArray {
    public static void main(String[] args) {
        int array[] = { 7, 2, 1, 5 };
        Median(array);
    }

    static void Median(int array[]) {
        int len = array.length;
        Arrays.sort(array);
        // int sum = 0;
        if (len % 2 == 0) {
            // int first = (len / 2) - 1;
            // int second = len / 2;
            System.out.println("Median of Array:" + (double) (array[(len / 2) - 1] + array[len / 2]) / 2);
        } else {
            System.err.println("Median of Array:" + array[len / 2]);
        }

    }
}
