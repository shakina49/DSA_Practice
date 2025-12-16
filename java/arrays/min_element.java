public class MinElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};

        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int min = arr[0]; // assume first element is min

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i]; // update min if current element is smaller
            }
        }

        System.out.println("Minimum element is: " + min);
    }
}
