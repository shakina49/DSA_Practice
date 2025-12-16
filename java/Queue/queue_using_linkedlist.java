import java.util.LinkedList;
import java.util.Scanner;

public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> queue = new LinkedList<>();

        while (true) {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int element = sc.nextInt();
                    queue.addLast(element);
                    break;

                case 2:
                    if (queue.isEmpty()) {
                        System.out.println("Queue Underflow!");
                    } else {
                        System.out.println("Dequeued: " + queue.removeFirst());
                    }
                    break;

                case 3:
                    if (queue.isEmpty()) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.println("Queue elements: " + queue);
                    }
                    break;

                case 4:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
