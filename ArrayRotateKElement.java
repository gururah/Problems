import java.util.Scanner;

public class ArrayRotateKElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int len = array.length;
        int arr[] = new int[len];
        System.out.println("Enter the N Element:");
        int n = sc.nextInt();
        RotateKElement(array, arr, n, len);
        display(arr, len);
        sc.close();
    }

    static int[] RotateKElement(int array[], int arr[], int n, int len) {
        int i, j = 0;
        for (i = n; i < len; i++) {
            arr[j] = array[i];
            j++;
        }
        for (i = 0; i < n; i++) {
            arr[j] = array[i];
            j++;
        }
        return arr;
    }

    static void display(int arr[], int len) {
        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
