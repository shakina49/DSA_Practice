import java.util.Scanner;
import java.util.Stack;
import java.util.Collections;

public class StackReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) stack.push(sc.nextInt());

        System.out.println("Original Stack: " + stack);

        Collections.reverse(stack); // brutal shortcut
        System.out.println("Reversed Stack: " + stack);
    }
}
