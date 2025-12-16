public class ReverseArray {
    public static void main(String[] args) {
        // Original array
        int[] arr = {1, 2, 3, 4, 5};

        // Reverse the array using two pointers
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Print reversed array
        System.out.print("Reversed array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
