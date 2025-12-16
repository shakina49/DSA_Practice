import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

public class LinkedListReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        System.out.println("Original LinkedList: " + list);

        Collections.reverse(list); // brutal shortcut, acceptable in interviews
        System.out.println("Reversed LinkedList: " + list);
    }
}
