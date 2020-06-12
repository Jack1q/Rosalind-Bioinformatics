import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] arr = new int[n];
        int[] keys = new int[m];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            keys[i] = s.nextInt();
        }
        for (int key : keys) {
            System.out.print(binarySearch(arr, key) + " ");
        }
    }
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key > arr[mid]) {
                low = mid + 1;
            }
            else if (key == arr[mid]) {
                return mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }
}