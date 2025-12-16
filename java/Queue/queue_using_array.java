import java.util.Scanner;

public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of queue: ");
        int size = sc.nextInt();
        int[] queue = new int[size];
        int front = -1, rear = -1;

        while (true) {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Enqueue
                    if (rear == size - 1) {
                        System.out.println("Queue Overflow!");
                    } else {
                        System.out.print("Enter element to enqueue: ");
                        int element = sc.nextInt();
                        if (front == -1) front = 0;
                        queue[++rear] = element;
                    }
                    break;

                case 2: // Dequeue
                    if (front == -1 || front > rear) {
                        System.out.println("Queue Underflow!");
                    } else {
                        System.out.println("Dequeued: " + queue[front++]);
                        if (front > rear) front = rear = -1;
                    }
                    break;

                case 3: // Display
                    if (front == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.print("Queue elements: ");
                        for (int i = front; i <= rear; i++) System.out.print(queue[i] + " ");
                        System.out.println();
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
