import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class LinkedListMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Maximum element: " + max);
        System.out.println("Minimum element: " + min);
    }
}
