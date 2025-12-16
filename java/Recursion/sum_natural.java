import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of first " + n + " natural numbers is: " + sum(n));
    }

    public static int sum(int n) {
        if (n == 0) return 0; // base case
        return n + sum(n - 1);
    }
}
