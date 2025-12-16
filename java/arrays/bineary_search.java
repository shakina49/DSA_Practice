import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array must have at least one element!");
            return;
        }

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter " + n + " elements (sorted in ascending order):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input key to search
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Binary search
        int index = binarySearch(arr, key);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    // Iterative binary search
    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // not found
    }
}
