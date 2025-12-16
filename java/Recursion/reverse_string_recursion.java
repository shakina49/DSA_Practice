import java.util.Scanner;

public class ReverseStringRecursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Reversed string: " + reverse(str));
    }

    public static String reverse(String str) {
        if (str.isEmpty()) return "";
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
