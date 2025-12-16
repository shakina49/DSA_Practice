import java.util.Scanner;

public class CheckSortedBoth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) ascending = false;
            if (arr[i] < arr[i + 1]) descending = false;
        }

        if (ascending) {
            System.out.println("Array is sorted in ascending order.");
        } else if (descending) {
            System.out.println("Array is sorted in descending order.");
        } else {
            System.out.println("Array is NOT sorted.");
        }
    }
}
