//Q 2. Write program to display the reverse array.

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        
        System.out.println("Original array:");
        for (int element : array) {
            System.out.print(element + " ");
        }
        
        System.out.println("\nReversed array:");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
