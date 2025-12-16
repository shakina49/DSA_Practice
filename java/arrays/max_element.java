public class MaxElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};

        if (arr.length == 0) {
            System.out.println("Array is empty!");
            return;
        }

        int max = arr[0]; // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current element is bigger
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}
