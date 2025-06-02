public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = {2, 5, 7, 0, 4, 0, 7, -5, 8, 0};

        // Print the original array
        System.out.print("The given array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int index = 0; // Index to place non-zero elements

        // Move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill the remaining elements with zeroes
        for (int i = index; i < arr.length; i++) {
            arr[i] = 0;
        }

        // Print the new array
        System.out.println("\nThe new array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
