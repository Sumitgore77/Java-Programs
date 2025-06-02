//Q 1. Write program to merge two array and display it.

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8};
        int[] mergedArray = new int[array1.length + array2.length];

        int i = 0;
        for (int element : array1) {
            mergedArray[i++] = element;
        }
        for (int element : array2) {
            mergedArray[i++] = element;
        }

        System.out.println("Merged Array:");
        for (int element : mergedArray) {
            System.out.print(element + " ");
        }
    }
}

