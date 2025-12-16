import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

public class StackMinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) stack.push(sc.nextInt());

        if (!stack.isEmpty()) {
            int max = Collections.max(stack);
            int min = Collections.min(stack);
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        } else {
            System.out.println("Stack is empty");
        }
    }
}
