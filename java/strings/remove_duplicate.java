import java.util.Scanner;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Use LinkedHashSet to remove duplicates and preserve order
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        System.out.print("Array after removing duplicates: ");
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}
