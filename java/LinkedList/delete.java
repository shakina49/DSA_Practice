import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        System.out.println("Original LinkedList: " + list);

        // Delete first
        list.removeFirst();
        // Delete last
        list.removeLast();

        // Delete at specific position
        System.out.print("Enter position to delete (0-based): ");
        int pos = sc.nextInt();
        if (pos >= 0 && pos < list.size()) list.remove(pos);

        System.out.println("LinkedList after deletions: " + list);
    }
}
