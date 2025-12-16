import java.util.Scanner;

public class RotateArrayBoth {

    // Reverse helper
    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Right rotation by k
    public static void rotateRight(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
    }

    // Left rotation by k
    public static void rotateLeft(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();

        System.out.print("Rotate (L for left, R for right): ");
        char direction = sc.next().toUpperCase().charAt(0);

        if (direction == 'R') {
            rotateRight(arr, k);
        } else if (direction == 'L') {
            rotateLeft(arr, k);
        } else {
            System.out.println("Invalid direction! Use L or R.");
            return;
        }

        System.out.print("Array after rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
