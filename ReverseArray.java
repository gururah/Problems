public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = { 30, 40, 10, 90, 20, 50, 80, 60 };
        int length = arr.length;
        System.out.println("Array");
        printArray(arr);
        System.out.println("");
        reverse(arr, length);
        System.out.println("");
        simpleRev(arr, length);

    }

    static void printArray(int arr[]) {
        int val = arr.length;
        for (int i = 0; i < val; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int arr[], int length) {

        int i = 0, temp;
        while (i < length) {
            temp = arr[length - 1];
            arr[length - 1] = arr[i];
            arr[i] = temp;
            i++;
            length--;
        }
        printArray(arr);
    }

    static void simpleRev(int arr[], int length) {
        int ans[] = new int[length];
        for (int j = length - 1; j >= 0; j--) {
            ans[length - j - 1] = arr[j];
        }
        printArray(ans);
    }
}
