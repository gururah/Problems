import java.util.HashMap;
import java.util.Map;

public class CountFreq {
    public static void main(String[] args) {
        int arr[] = { 10, 5, 10, 50, 5, 10 };
        int n = arr.length;
        Frequency(arr, n);
        Freq1(arr, n);
    }

    public static void Freq1(int arr[], int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static void Frequency(int arr[], int n) {
        boolean visited[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] == arr[i]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + ":" + count);
        }

    }
}
