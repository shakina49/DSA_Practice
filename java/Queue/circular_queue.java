import java.util.Scanner;

public class CircularQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of circular queue: ");
        int size = sc.nextInt();
        int[] cq = new int[size];
        int front = -1, rear = -1;

        while (true) {
            System.out.println("\n1.Enqueue 2.Dequeue 3.Display 4.Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Enqueue
                    if ((rear + 1) % size == front) {
                        System.out.println("Circular Queue Overflow!");
                    } else {
                        System.out.print("Enter element to enqueue: ");
                        int element = sc.nextInt();
                        if (front == -1) front = 0;
                        rear = (rear + 1) % size;
                        cq[rear] = element;
                    }
                    break;

                case 2: // Dequeue
                    if (front == -1) {
                        System.out.println("Circular Queue Underflow!");
                    } else {
                        System.out.println("Dequeued: " + cq[front]);
                        if (front == rear) {
                            front = rear = -1;
                        } else {
                            front = (front + 1) % size;
                        }
                    }
                    break;

                case 3: // Display
                    if (front == -1) {
                        System.out.println("Queue is empty");
                    } else {
                        System.out.print("Circular Queue elements: ");
                        int i = front;
                        while (true) {
                            System.out.print(cq[i] + " ");
                            if (i == rear) break;
                            i = (i + 1) % size;
                        }
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
