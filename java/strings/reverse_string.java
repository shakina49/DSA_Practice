import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert string to char array
        char[] arr = str.toCharArray();

        // Reverse using two pointers
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Convert back to string
        String reversed = new String(arr);
        System.out.println("Reversed string: " + reversed);
    }
}
