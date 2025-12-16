import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        System.out.println("Original LinkedList: " + list);

        // Insert at beginning
        System.out.print("Enter element to insert at beginning: ");
        list.addFirst(sc.nextInt());

        // Insert at end
        System.out.print("Enter element to insert at end: ");
        list.addLast(sc.nextInt());

        // Insert at specific position
        System.out.print("Enter element and position to insert (0-based): ");
        int val = sc.nextInt();
        int pos = sc.nextInt();
        if (pos >= 0 && pos <= list.size()) list.add(pos, val);

        System.out.println("LinkedList after insertions: " + list);
    }
}
