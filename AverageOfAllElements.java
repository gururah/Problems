import java.util.Scanner;

public class AverageOfAllElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 1, 2, 1, 1, 5, 1 };
        int len = array.length;
        Average(array, len);
        sc.close();

    }

    static void Average(int array[], int len) {
        float sum = 0;
        for (int i = 0; i < len; i++) {
            sum = array[i] + sum;
        }
        sum = sum / len;
        System.out.printf("Average of All elements: %.2f%n", sum);
    }
}
