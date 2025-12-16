import java.util.Scanner;

public class DecimalToBinaryRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int n = sc.nextInt();
        System.out.println("Binary representation: " + decimalToBinary(n));
    }

    public static String decimalToBinary(int n) {
        if (n == 0) return "0";
        if (n == 1) return "1";
        return decimalToBinary(n / 2) + (n % 2);
    }
}
