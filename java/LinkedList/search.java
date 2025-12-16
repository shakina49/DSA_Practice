import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) list.add(sc.nextInt());

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = list.indexOf(key);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found.");
        }
    }
}
