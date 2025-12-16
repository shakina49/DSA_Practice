import java.util.Scanner;
import java.util.Stack;

public class StackPeekEmpty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) stack.push(sc.nextInt());

        if (!stack.isEmpty()) {
            System.out.println("Top element (peek): " + stack.peek());
        } else {
            System.out.println("Stack is empty");
        }

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
